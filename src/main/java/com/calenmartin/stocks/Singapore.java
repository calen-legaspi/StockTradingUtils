package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class Singapore {
	public static void main(String[] args) {
		screenMorningstar(tickersIbkrCFDs("SG", 1), "xses");
	}
}
