package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Switzerland {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("CH", 2), "xswx");
	}
}
