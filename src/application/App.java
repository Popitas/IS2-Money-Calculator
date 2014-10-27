package application;

import control.ExchangeCommand;
import view.persistence.CurrencySetLoader;

public class App {

    public static void main(String[] args) {
        
        ExchangeCommand exchangeController = new ExchangeCommand();
        CurrencySetLoader currencyLoader = new CurrencySetLoader();
        
        while(true) {
            exchangeController.execute();
            currencyLoader.load();
        }
    }
    
}
