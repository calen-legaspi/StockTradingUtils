package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.*;

class All {

	public static void main(String[] args) {
		try {
			screenMorningstar(tickersIbkrCFDs("AU", 3), "xasx");
			screenMorningstar(tickersIbkrCFDs("BE", 1), "xbru");
			screenMorningstar(tickersIbkrCFDs("BR", 1), "bvmf");
			screenMorningstar(tickersIbkrCFDs("CZ", 1), "xpra");
			screenMorningstar(tickersIbkrCFDs("FI", 1), "xhel");
			screenMorningstar(tickersIbkrCFDs("FR", 2), "xpar");
			screenMorningstar(tickersIbkrCFDs("DE", 2), "xetr");
			screenMorningstar(tickersIbkrCFDs("HK", 2), "xhkg");
			screenMorningstar(tickersIbkrCFDs("JP", 11), "xtks");
			screenMorningstar(tickersIbkrCFDs("NL", 1), "xams");
			screenMorningstar(tickersIbkrCFDs("NO", 2), "xosl");
			screenMorningstar(tickersIbkrCFDs("PT", 2), "xlis");
			screenMorningstar(tickersIbkrCFDs("SG", 1), "xses");
			screenMorningstar(tickersIbkrCFDs("ZA", 1), "xjse");
			screenMorningstar(tickersIbkrCFDs("ES", 1), "xmad");
			screenMorningstar(tickersIbkrCFDs("SE", 2), "xsto");
			screenMorningstar(tickersIbkrCFDs("CH", 2), "xswx");
			screenMorningstar(tickersIbkrCFDs("GB", 6), "xlon");
			screenMorningstar(tickersIbkrCFDs("US", 36), "xnas");
			screenMorningstar(tickersIbkrCFDs("US", 36), "xnys");
		} finally {
			close();
		}
	}

}
