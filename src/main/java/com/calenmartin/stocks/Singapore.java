package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Singapore {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("SG", 1), "xses");
	}
}
