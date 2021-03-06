package com.calenmartin.stocks;

import java.io.*;
import java.time.*;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

class Util {
	/** Set the path to your chrome user-data-dir here. **/
	private static final String CHROME_USER_DATA_DIR = "user-data-dir=/home/calen/.config/google-chrome/Profile 2";
	private static WebDriver driver;
	private static PrintWriter writer;
    private static final Duration WAIT = Duration.ofSeconds(5);

	static {
		ChromeOptions options = new ChromeOptions();
		options.addArguments(CHROME_USER_DATA_DIR);
		driver = new ChromeDriver(options);
		try {
			writer = new PrintWriter(new FileOutputStream("recommendations.md", true), true);
			writer.println(LocalDateTime.now() + "    ");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	/**
	 * Collect ticker symbols from the list of IBKR CFD products of a specific
	 * country.
	 **/
	static Collection<String> tickersIbkrCFDs(String countryCode, int pages) {
		String url = "https://www.interactivebrokers.co.uk/en/index.php?f=38931&exch=&showcategories=&p=&cc="
				+ countryCode + "&limit=100&page=";
		Collection<String> tickers = new ArrayList<>();
		for (int i = 1; i <= pages; i++) {
			driver.get(url + i);
			driver.findElements(By.cssSelector("td:nth-of-type(4)")).stream().map(e -> e.getText())
					.forEachOrdered(tickers::add);
		}
		return tickers;
	}

	static void screenMorningstarThenClose(Collection<String> tickers, String exchange) {
		try {
			screenMorningstar(tickers, exchange);
		} finally {
			close();
		}
	}

	static void screenMorningstar(Collection<String> tickers, String exchange) {
		tickers.forEach(ticker -> {
			try {
				String url = "https://www.morningstar.com/stocks/" + exchange + "/" + ticker + "/quote";
				driver.get(url);
				WebElement starRatingElement = driver.findElement(By.className("mdc-security-header__star-rating"));
				String rating = starRatingElement.getAttribute("aria-label");
				String moat = "";
				try {
					WebElement moatElement = new WebDriverWait(driver, WAIT)
							.until(ExpectedConditions.elementToBeClickable(By.className("moat-value")));

					moat = moatElement != null ? ", Moat: " + moatElement.getText() : "";
				} catch (NoSuchElementException | TimeoutException e) {
//						e.printStackTrace();
				}
				String discount = "";
				try {
					WebElement discountElement = new WebDriverWait(driver, WAIT)
							.until(ExpectedConditions.elementToBeClickable(
									By.className("assessment")));
					discount = ", " + discountElement.getText();
				} catch (NoSuchElementException | TimeoutException e) {
//						e.printStackTrace();
				}
				// Only show results with rating "5 stars" or with "4 stars and wide moat"
				if (rating.startsWith("5") || (rating.startsWith("4") && moat.equals("Wide"))) {
					String output = exchange + " " + ticker + " " + rating + " " + moat + " " + discount + "    ";
					System.out.println(output);
					writer.println(output);
				}
			} catch (NoSuchElementException e) {
//					e.printStackTrace();
			}
		});
	}

	static void close() {
		driver.close();
		writer.flush();
		writer.close();
	}
}
