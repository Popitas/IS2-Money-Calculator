package model;

import java.util.TreeSet;

public class CurrencySet {
    
    private static TreeSet<Currency> currencies;

    public CurrencySet(TreeSet<Currency> currencies) {
        CurrencySet.currencies = new TreeSet<>(currencies);
    }    
    
}
