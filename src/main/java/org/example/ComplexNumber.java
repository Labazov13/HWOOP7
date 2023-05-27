package org.example;

public class ComplexNumber {
    private int truePart;
    private String falsePart;
    private String sign;

    public ComplexNumber(int truePart, String sign, String falsePart) {
        this.truePart = truePart;
        this.sign = sign;
        this.falsePart = falsePart;
    }

    public int getTruePart() {
        return truePart;
    }

    public String getFalsePart() {
        return falsePart;
    }

    public String getSign() {
        return sign;
    }

    @Override
    public String toString() {
        return getTruePart() + getSign() + getFalsePart();
    }
}
