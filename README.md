# StockTradingUtils

These are my personal stock trading utilities. I don't intend them for general use, but if you find anything useful feel free to lift ideas.

For now, all it does is scan IBKR for their list of CFD products, and then screens Morningstar for five-star stocks and four-star stocks with wide moat. I might try integrating it with the IBKR API later on, but I don't know when that's going to happen.

Before running any of the runners, you need to set the path of **user-data-dir** for Chrome. Go to the **```Util```** class, and then set the **```CHROME_USER_DATA_DIR```** field with your Chrome user-data-dir path.