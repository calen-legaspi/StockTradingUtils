package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Portugal {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("PT", 2), "xlis");
	}
}
