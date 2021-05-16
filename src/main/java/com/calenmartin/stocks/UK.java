package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class UK {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("GB", 6), "xlon");
	}
}
