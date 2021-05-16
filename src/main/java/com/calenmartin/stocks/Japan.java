package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Japan {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("JP", 11), "xtks");
	}
}
