package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Spain {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("ES", 1), "xmad");
	}
}
