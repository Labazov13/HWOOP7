package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    Calculable calculable;

    public View(Calculable calculable) {
        this.calculable = calculable;
    }

    public void run() {
        List<ComplexNumber> complexNumbers = new ArrayList<>();
        complexNumbers.add(calculable.create());
        complexNumbers.add(calculable.create());
        while (true) {
            String sign = enterString("Введите действие над числами (+, -): ");
            if (sign.equals("+")) {
                calculable.sum(complexNumbers);
                break;
            }
            if (sign.equals("-")) {
                calculable.subtraction(complexNumbers);
                break;
            }
        }
    }

    public static int enterInt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    public static String enterString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
