package application;

import control.ExchangeCommand;
import java.awt.event.ActionEvent;
import model.CurrencySet;
import view.persistence.CurrencySetLoader;
import view.ui.ExchangeDialog;
import view.ui.swing.ApplicationFrame;

public class App {

    public static void main(String[] args) {

       while (true) {
            CurrencySet currencySet = DBCurrencySetLoader().load();
            ApplicationFrame frame = new ApplicationFrame();
            frame.register((ActionEvent e) -> {
                new ExchangeCommand((ExchangeDialog) frame.getExchangeDialog()).execute();
            });
        }
    }

}
