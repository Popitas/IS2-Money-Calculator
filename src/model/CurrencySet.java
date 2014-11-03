package model;

import java.util.SortedMap;
import java.util.TreeMap;

public class CurrencySet {
    
    private static SortedMap<String, String> currencies;

    public CurrencySet() {
        currencies = new TreeMap<>();
    }
    
    public void addCurrency(Currency currency) {
        currencies.put(currency.getCode(), currency.getName());
    }
    
}