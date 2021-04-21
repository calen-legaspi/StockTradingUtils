package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Brazil {
	public static void main(String[] args) {
		screenMorningstar(tickersIbkrCFDs("BR", 1), "bvmf");
	}
}
