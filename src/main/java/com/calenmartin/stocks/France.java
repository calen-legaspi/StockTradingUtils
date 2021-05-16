package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class France {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("FR", 2), "xpar");
	}
}
