package view.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements CurrencyLoader {

    CurrencySet currencies = new CurrencySet();
    private final Connection connection;

    public CurrencySetLoader(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Currency[] load() {
        try {
            return processQuerry(connection.createStatement().executeQuery("SELECT * FROM CURRENCIES"));
        } catch (SQLException ex) {
            return new Currency[0];
        }
    }

    private Currency[] processQuerry(ResultSet resultSet) throws SQLException {
        ArrayList<Currency> currencyList = new ArrayList<>();
        while(resultSet.next())
            currencyList.add(processCurrency(resultSet));
        return currencyList.toArray(new Currency[currencyList.size()]);
    }

    private Currency processCurrency(ResultSet resultSet) throws SQLException {
        return new Currency(
            resultSet.getString("code"),
            resultSet.getString("name"),
            resultSet.getString("symbol"));
    }


}
