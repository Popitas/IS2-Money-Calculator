package view.ui.swing;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ApplicationFrame extends JFrame {
    
    private JPanel exchangeDialog;
    
    public ApplicationFrame() {
        this.setTitle("Money Calculator");
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(createMoneyPanel());
        this.add(createExchangePanel());
        this.add(createCalculateButton());
    }

    private JPanel createExchangePanel() {
        ExchangeDialogPanel dialogPanel = new ExchangeDialogPanel();
        exchangeDialog = dialogPanel;
        return dialogPanel;
    }

    private JPanel createMoneyPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JPanel createCalculateButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public JPanel getExchangeDialog() {
        return exchangeDialog;
    }

    public void register(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
