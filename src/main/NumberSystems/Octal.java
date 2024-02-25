package main.NumberSystems;

import main.NumberSystems.Decimal;

import java.util.ArrayList;

public class Octal {
    private final String value;

    public Octal(String value) {
        this.value = value;
    }

    public boolean isValidOctalNumber() {
        ArrayList<Integer> list = convertStringToList();

        for(Integer digit : list) {
            if (digit > 7) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> convertStringToList() {
        ArrayList<Integer> valueList = new ArrayList<>();
        char[] digits = value.toCharArray();
        for (char digit : digits) {
            valueList.add(digit - '0');
        }

        return valueList;
    }

    public String toDecimal() {
        if (value.equals("0")) {
            return "0";
        }

        // Make octal number a list
        ArrayList<Integer> octalList = convertStringToList();

        int sum = 0;
        int power = octalList.size() - 1;

        for(Integer digit : octalList) {
            sum += (int) (digit * (Math.pow(8, power)));
            power--;
        }

        return Integer.toString(sum);
    }

    public String toBinary() {
        if (value.equals("0")) {
            return "0";
        }

        // Convert to decimal
        int decimal = Integer.parseInt(toDecimal());
        Decimal dec = new Decimal(decimal);

        // Convert to binary
        return dec.toBinary();
    }

    public String toHexadecimal() {
        if (value.equals("0")) {
            return "0";
        }

        // Convert to decimal
        int decimal = Integer.parseInt(toDecimal());
        Decimal dec = new Decimal(decimal);

        // Convert to hexadecimal
        return dec.toHexadecimal();
    }

    public String toString() {
        return "Decimal: " + toDecimal() + "\n" +
                "Binary: " + toBinary() + "\n" +
                "Octal: " + value + "\n" +
                "Hexadecimal: " + toHexadecimal();
    }
}
