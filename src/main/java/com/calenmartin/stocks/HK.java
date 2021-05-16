package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class HK {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("HK", 2), "xhkg");
	}
}
