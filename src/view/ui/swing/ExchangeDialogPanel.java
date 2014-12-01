package view.ui.swing;

import java.awt.FlowLayout;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Currency;
import model.Exchange;
import model.Money;
import view.ui.ExchangeDialog;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog {

    private Exchange exchange;
    private Currency toCurrency;
    private double amount;
    private Currency fromCurrency;

    public ExchangeDialogPanel() {
        this.setLayout(new FlowLayout());
        this.add(createAmountField());
        this.add(createFromCurrencyField());
        this.add(createToCurrencyField());
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(new Money(amount, fromCurrency), toCurrency);
    }

    private JComboBox<Currency> createToCurrencyField() {
        JComboBox<Currency> combo = new JComboBox<>(/*currencies*/);
        combo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != ItemEvent.SELECTED) return;
                toCurrency = combo.getItemAt(combo.getSelectedIndex());
            }
        });
        return combo;
    }

    private JComboBox<Currency> createFromCurrencyField() {
        JComboBox<Currency> combo = new JComboBox<>(/*currencies*/);
        combo.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != ItemEvent.SELECTED) return;
                fromCurrency = combo.getItemAt(combo.getSelectedIndex());
            }
        });
        return combo;
    }

    private JTextField createAmountField() {
        JTextField text = new JTextField();
        text.addInputMethodListener(new InputMethodListener() {

            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                try {
                    amount = Double.parseDouble(text.getText());
                } catch (Exception e) {
                    
                }
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        return text;
    }

}
