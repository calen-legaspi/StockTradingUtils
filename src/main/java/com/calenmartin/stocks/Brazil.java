package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Brazil {
	public static void main(String[] args) {
		screenMorningstarThenClose(tickersIbkrCFDs("BR", 1), "bvmf");
	}
}
