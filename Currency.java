// Currency.java

/**
 * Represents a currency with its symbol and exchange rate.
 */
public class Currency {
    private String symbol;
    private double exchangeRate;

    /**
     * Constructs a new Currency object.
     *
     * @param symbol      the currency symbol (e.g., "USD", "EUR", etc.)
     * @param exchangeRate the exchange rate relative to the base currency
     */
    public Currency(String symbol, double exchangeRate) {
        this.symbol = symbol;
        this.exchangeRate = exchangeRate;
    }

    /**
     * Gets the currency symbol.
     *
     * @return the currency symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Gets the exchange rate.
     *
     * @return the exchange rate
     */
    public double getExchangeRate() {
        return exchangeRate;
    }
}