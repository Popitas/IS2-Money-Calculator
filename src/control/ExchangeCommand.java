package control;

import model.CurrencySet;
import view.ui.ExchangeDialog;

public class ExchangeCommand {

    private CurrencySet currencies;
    private final ExchangeDialog exchangeDialog;

    public ExchangeCommand(ExchangeDialog exchangeDialog) {
        this.exchangeDialog = exchangeDialog;
    }

    public void execute() {

    }

}
