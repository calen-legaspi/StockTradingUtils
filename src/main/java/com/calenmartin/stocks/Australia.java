package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

import java.util.*;

class Australia {
	public static void main(String[] args) {
		Collection<String> tickers = tickersIbkrCFDs("AU", 3);
		screenMorningstar(tickers, "xasx");
	}
}
