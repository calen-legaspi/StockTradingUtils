package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class SouthAfrica {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("ZA", 1), "xjse");
	}
}
