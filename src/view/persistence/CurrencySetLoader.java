package view.persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    CurrencySet currencies = new CurrencySet();

    public void loadCurrencies() {
        currencies.addCurrency(new Currency("USD", "Dólar estadounidense"));
        currencies.addCurrency(new Currency("EUR", "Euro"));
        currencies.addCurrency(new Currency("GBP", "Libra esterlina"));
        currencies.addCurrency(new Currency("INR", "Rupia india"));
        currencies.addCurrency(new Currency("AUD", "Dólar australiano"));
    }

}
