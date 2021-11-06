package com.calenmartin.stocks;

import static com.calenmartin.stocks.Util.screenMorningstarThenClose;
import static com.calenmartin.stocks.Util.tickersIbkrCFDs;

class Denmark {
 public static void main(String[] args) {
  screenMorningstarThenClose(tickersIbkrCFDs("DK", 1), "xcse");
 }
}
