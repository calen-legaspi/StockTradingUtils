package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class US_NASDAQ {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("US", 36), "xnas");
	}
}
