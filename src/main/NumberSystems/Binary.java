package main.NumberSystems;

import java.util.ArrayList;

public class Binary {
    private final String value;
    public Binary(String value) {
        this.value = value;
    }

    // Check if valid binary number
    public boolean isValidBinaryNumber() {
        ArrayList<Integer> binary = new ArrayList<>();
        binary = convertStringToList();
        for (Integer bit : binary) {
            if (bit != 0 && bit != 1) {
                return false;
            }
        }

        return true;
    }

    // Converts the String binary from the constructor to a list
    public ArrayList<Integer> convertStringToList() {
        ArrayList<Integer> valueList = new ArrayList<>();
        char[] bits = value.toCharArray();
        for (char bit : bits) {
            valueList.add(bit - '0');
        }

        return valueList;
    }

    public String toDecimal() {
        if (value.equals("0")) {
            return "0";
        }

        ArrayList<Integer> binary = convertStringToList();

        int sum = 0;
        int power = binary.size() - 1;

        for (Integer bit : binary) {
            if(bit == 0){
                power--;
                continue;
            }

            sum += (int) Math.pow(2, power);
            power--;
        }

        return Integer.toString(sum);
    }

    public String toOctal() {
        if (value.equals("0")) {
            return "0";
        }

        // Convert to decimal
        int decimal = Integer.parseInt(toDecimal());
        Decimal dec = new Decimal(decimal);

        // Convert decimal to octal
        return dec.toOctal();
    }

    public String toHexadecimal() {
        if (value.equals("0")) {
            return "0";
        }

        // Convert to decimal
        int decimal = Integer.parseInt(toDecimal());
        Decimal dec = new Decimal(decimal);

        // Convert decimal to hexadecimal
        return dec.toHexadecimal();
    }

    public String toString() {
        return "Decimal: " + toDecimal() + "\n" +
                "Binary: " + value + "\n" +
                "Octal: " + toOctal() + "\n" +
                "Hexadecimal: " + toHexadecimal();
    }
}
