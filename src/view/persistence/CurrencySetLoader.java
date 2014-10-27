package view.persistence;

import java.util.TreeSet;
import model.Currency;

public class CurrencySetLoader {

    public void load() {
        TreeSet<Currency> currencies = new TreeSet<>();
        
        fill(currencies);
    }
    
    public TreeSet<Currency> fill(TreeSet<Currency> currencies) {
        for (int i = 0; i < 100; i++) {
            //currencies.add(i);
            
        }
        return currencies;
    }
    
}
