package view.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Currency;
import model.CurrencySet;

public class DBCurrencySetLoader implements CurrencySetLoader {
    
    CurrencySet currencies = new CurrencySet();
    private final Connection connection;

    public DBCurrencySetLoader(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Currency[] load() {
        try {
            return processQuery(connection.createStatement().executeQuery("SELECT * FROM CURRENCIES"));
        } catch (SQLException ex) {
            return new Currency[0];
        }
    }

    private Currency[] processQuery(ResultSet resultSet) throws SQLException {
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
