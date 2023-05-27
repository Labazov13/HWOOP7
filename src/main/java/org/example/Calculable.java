package org.example;

import java.util.List;

public interface Calculable {
    ComplexNumber create();

    String sum(List<ComplexNumber> complexNumberList);

    String subtraction(List<ComplexNumber> complexNumberList);
}
