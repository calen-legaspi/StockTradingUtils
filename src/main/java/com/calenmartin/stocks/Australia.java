package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Australia {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("AU", 3), "xasx");
	}
}
