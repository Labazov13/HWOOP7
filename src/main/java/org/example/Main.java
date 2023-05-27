package org.example;

public class Main {
    public static void main(String[] args) {
        FindAble finder = new Finder();
        Calculable calculable = new ComplexOperation(finder);
        View view = new View(calculable);
        view.run();
    }
}