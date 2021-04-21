package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

import java.util.*;

class US_NASDAQ {
	public static void main(String[] args) {
		screenMorningstar(tickersIbkrCFDs("US", 36), "xnas");
	}
}
