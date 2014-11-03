package model;

public class Currency {

    private final String code;
    private final String name;
    private final Character symbol;

    public Currency(String code, String name, Character symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Character getSymbol() {
        return symbol;
    }

}
