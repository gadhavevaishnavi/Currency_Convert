import java.util.HashMap;
import java.util.Map;

/**
 * A simple currency converter.
 */
public class CurrencyConverter {
    private Map<String, Currency> currencies;

    /**
     * Constructs a new CurrencyConverter object.
     */
    public CurrencyConverter() {
        this.currencies = new HashMap<>();
        // Add some sample currencies
        currencies.put("USD", new Currency("US Dollar", 1.0));
        currencies.put("EUR", new Currency("Euro", 0.88));
        currencies.put("GBP", new Currency("British Pound", 0.76));
        currencies.put("INR", new Currency("Indian Rupee", 74.83));
        currencies.put("AUD", new Currency("Australian Dollar", 1.48));
    }

    /**
     * Converts an amount from one currency to another.
     *
     * @param fromCurrency the currency to convert from
     * @param toCurrency   the currency to convert to
     * @param amount       the amount to convert
     * @return the converted amount
     */
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (!currencies.containsKey(fromCurrency) || !currencies.containsKey(toCurrency)) {
            throw new RuntimeException("Invalid currency");
        }
        Currency from = currencies.get(fromCurrency);
        Currency to = currencies.get(toCurrency);
        return amount / from.getExchangeRate() * to.getExchangeRate();
    }
}