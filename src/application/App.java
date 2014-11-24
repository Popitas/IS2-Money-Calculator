package application;

import control.ExchangeCommand;
import view.persistence.CurrencySetLoader;

public class App {

    public static void main(String[] args) {

        //CurrencySetLoader currencyLoader = new CurrencySetLoader();
        ExchangeCommand exchangeController = new ExchangeCommand();

        while (true) {
            exchangeController.execute();
        }
    }

}
