package view.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ExchangeRate;

public class DBExchangeRateLoader implements ExchangeRateLoader {

    ExchangeRate rate = new ExchangeRate();
    private final Connection connection;

    public DBExchangeRateLoader(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ExchangeRate load() {
        try {
            return processQuery(connection.createStatement().executeQuery(
                    "SELECT rate FROM currencies WHERE"));
        } catch (SQLException ex) {
            Logger.getLogger(DBExchangeRateLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private ExchangeRate processQuery(ResultSet executeQuery) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
