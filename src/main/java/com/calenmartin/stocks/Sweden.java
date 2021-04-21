package com.calenmartin.stocks;

import java.util.*;

import static com.calenmartin.stocks.Util.*;

class Sweden {

	public static void main(String[] args) {
		Collection<String> tickers = new ArrayList<>();
		screenMorningstar(tickers, "xsto");
		screenMorningstar(tickersIbkrCFDs("SE", 2), "xsto");
	}

}
