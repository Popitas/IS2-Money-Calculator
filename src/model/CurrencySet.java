package model;

import java.util.SortedMap;
import java.util.TreeMap;

public class CurrencySet {
    
    private static SortedMap<String, Currency> currencies;

    public CurrencySet() {
        currencies = new TreeMap<>();
    }
    
    public void add(Currency currency) {
        currencies.put(currency.getCode(), currency);
    }
    
    public Currency[] getCurrencies() {
        return null;
    }
}