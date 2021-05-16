package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Germany {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("DE", 2), "xetr");
//		screenMorningstar(tickersIbkrCFDs("DE", 2), "xhan");
//		screenMorningstar(tickersIbkrCFDs("DE", 2), "xham");
//		screenMorningstar(tickersIbkrCFDs("DE", 2), "xber");
	}
}
