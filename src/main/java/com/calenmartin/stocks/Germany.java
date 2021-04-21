package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

import java.util.*;

class Germany {
	public static void main(String[] args) {
		screenMorningstar(tickersIbkrCFDs("DE", 2), "xetr");
	}
}
