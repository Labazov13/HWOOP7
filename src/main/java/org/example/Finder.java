package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder implements FindAble {

    @Override
    public String findFalsePart(ComplexNumber complexNumber) {
        String argument = "";
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(complexNumber.getFalsePart());
        if (matcher.find()) {
            argument = complexNumber.getFalsePart().substring(matcher.start(), matcher.end());
        }
        return argument;
    }

    @Override
    public String findIndex(ComplexNumber complexNumber) {
        String index = "";
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(complexNumber.getFalsePart());
        if (matcher.find()) {
            index = (complexNumber.getFalsePart().substring(matcher.start(), matcher.end()));
        }
        return index;
    }
}
