package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Spain {
	public static void main(String[] args) {
		screenMorningstar(tickersIbkrCFDs("ES", 1), "xmad");
	}
}
