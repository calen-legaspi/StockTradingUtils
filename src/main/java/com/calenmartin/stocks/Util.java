package com.calenmartin.stocks;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.*;

class Util {
	/** Set the path to your chrome user-data-dir here. **/
	private static final String CHROME_USER_DATA_DIR = "user-data-dir=/home/calen/.config/google-chrome/Profile 2";
	private static WebDriver driver;

	static {
		ChromeOptions options = new ChromeOptions();
		options.addArguments(CHROME_USER_DATA_DIR);
		driver = new ChromeDriver(options);
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

	static void screenMorningstar(Collection<String> tickers, String exchange) {
		try {
			tickers.forEach(ticker -> {
				try {
					String url = "https://www.morningstar.com/stocks/" + exchange + "/" + ticker + "/quote";
					driver.get(url);
					WebElement starRatingElement = driver.findElement(By.className("mdc-security-header__star-rating"));
					String rating = starRatingElement.getAttribute("aria-label");
					WebElement moatElement = driver.findElement(By.className("moat-value"));
					String moat = "Moat " + moatElement.getText();
					String discount = "";
					try {
						WebElement discountElement = driver
								.findElement(By.cssSelector("span[ng-if=\"analysisData.valuation.premDiscDelta\""));
						discount = discountElement.getText() + " discount";
					} catch (NoSuchElementException e) {
						// if discount element not found, leave discount blank
					}
					// Only show results with rating "5 stars" or with "4 stars and wide moat"
					if (rating.startsWith("5") || (rating.startsWith("4") && moat.equals("Wide"))) {
						System.out.println(ticker + " " + rating + " " + moat + " " + discount);
					}
				} catch (NoSuchElementException e) {
					// SKIP / DO NOTHING
				}
			});
		} finally {
			driver.close();
		}
	}
}
