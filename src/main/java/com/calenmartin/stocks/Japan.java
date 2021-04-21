package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

import java.util.*;

class Japan {
	public static void main(String[] args) {
		screenMorningstar(tickersIbkrCFDs("JP", 11), "xtks");
	}
}
