package org.example;

import java.util.List;

public class ComplexOperation implements Calculable {
    FindAble findAble;

    public ComplexOperation(FindAble findAble) {
        this.findAble = findAble;
    }

    @Override
    public ComplexNumber create() {
        int one = View.enterInt("Введите первую часть выражения: ");
        String two = View.enterString("Введите математический знак: ");
        String three = View.enterString("Введите вторую часть выражения: ");
        return new ComplexNumber(one, two, three);
    }

    @Override
    public String sum(List<ComplexNumber> complexNumberList) {
        int onePart;
        int twoPart;
        String index = findAble.findIndex(complexNumberList.get(1));
        onePart = complexNumberList.get(0).getTruePart() + complexNumberList.get(1).getTruePart();
        String oneArgument = findAble.findFalsePart(complexNumberList.get(0));
        String twoArgument = findAble.findFalsePart(complexNumberList.get(1));
        twoPart = Integer.parseInt(oneArgument) - Integer.parseInt(twoArgument);
        if (twoPart > 0) {
            System.out.println(onePart + "+" + twoPart + index);
            return onePart + "+" + twoPart + index;
        }
        System.out.println(onePart + "" + twoPart + index);
        return onePart + "" + twoPart + index;
    }

    @Override
    public String subtraction(List<ComplexNumber> complexNumberList) {
        int onePart;
        int twoPart;
        String index = findAble.findIndex(complexNumberList.get(1));
        onePart = complexNumberList.get(0).getTruePart() - complexNumberList.get(1).getTruePart();
        String oneArgument = findAble.findFalsePart(complexNumberList.get(0));
        String twoArgument = findAble.findFalsePart(complexNumberList.get(1));
        twoPart = Integer.parseInt(oneArgument) + Integer.parseInt(twoArgument);
        if (twoPart > 0) {
            System.out.println(onePart + "+" + twoPart + index);
            return onePart + "+" + twoPart + index;
        }
        System.out.println(onePart + "" + twoPart + index);
        return onePart + "" + twoPart + index;
    }
}
