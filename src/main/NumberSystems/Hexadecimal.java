package main.NumberSystems;

import main.NumberSystems.Decimal;

import java.util.ArrayList;

public class Hexadecimal {
    private final String value;

    public Hexadecimal(String value) {
        this.value = value;
    }

    public boolean isValidHexadecimalNumber() {
        char[] list = value.toCharArray();

        for(int i = 0; i < list.length; i++) {
            // Checks if current character is from 0-9 and A-F
            // If not, return false
            if (!(list[i] >= 48 && list[i] <= 57) && !(list[i] >= 65 && list[i] <= 70)) {
                return false;
            }
        }

        return true;
    }
    public ArrayList<Integer> convertStringToList() {
        // Array for the letters (A, B, C, D, E, F)
        int[] beyondNine = {10, 11, 12, 13, 14, 15};

        ArrayList<Integer> valueList = new ArrayList<>();
        char[] digits = value.toCharArray();
        for (char digit : digits) {
            // If letter, convert it to its corresponding number
            if (digit >= 65 && digit <= 70) {
                valueList.add(beyondNine[digit - 65]);
                continue;
            }

            valueList.add(digit - '0');
        }

        return valueList;
    }

    public String toDecimal() {
        if (value.equals("0")) {
            return "0";
        }

        // Convert String value to list
        ArrayList<Integer> hexadecimalConverted = convertStringToList();

        int sum = 0;
        int power = hexadecimalConverted.size() - 1;

        for(Integer digit : hexadecimalConverted) {
            sum += (int) (digit * (Math.pow(16, power)));
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

    public String toOctal() {
        if (value.equals("0")) {
            return "0";
        }

        // Convert to decimal
        int decimal = Integer.parseInt(toDecimal());
        Decimal dec = new Decimal(decimal);

        // Convert to octal
        return dec.toOctal();
    }

    public String toString() {
        return "Decimal: " + toDecimal() + "\n" +
                "Binary: " + toBinary() + "\n" +
                "Octal: " + toOctal() + "\n" +
                "Hexadecimal: " + value;
    }
}
