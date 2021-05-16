package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class USA_NYSE {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("US", 36), "xnys");
	}
}
