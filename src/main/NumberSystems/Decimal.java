package main.NumberSystems;

import java.util.ArrayList;
import java.util.Collections;

public class Decimal {
    private final int value;

    public Decimal(int value) {
        this.value = value;
    }

    public String toBinary() {
        if (value == 0) {
            return "0";
        }

        int decimalValue = value;

        // Convert to positive if the value is negative
        if (decimalValue < 0) {
            decimalValue *= -1;
        }

        ArrayList<Integer> binary = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // Formula
        // Start at last digit, divide by 2 and get the remainder for each
        while (decimalValue >= 1) {
            binary.add(decimalValue % 2);
            decimalValue /= 2;
        }

        // Reverse the ArrayList to get the binary representation
        Collections.reverse(binary);

        // If value was negative, add negative sign at beginning of String
        if (value < 0) {
            sb.append("-");
        }

        // Add each bit to the String
        for(Integer bit : binary) {
            sb.append(bit);
        }

        return sb.toString();
    }

    public String toOctal() {
        if (value == 0) {
            return "0";
        }

        int decimalValue = value;

        // Convert to positive if value is negative
        if (decimalValue < 0) {
            decimalValue *= -1;
        }

        ArrayList<Integer> octal = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // Formula
        // Start at last digit, divide by 8 and get the remainder for each
        while (decimalValue >= 1) {
            octal.add(decimalValue % 8);
            decimalValue /= 8;
        }

        // Reverse the ArrayList to get the octal representation
        Collections.reverse(octal);

        // If value was negative, add negative sign at beginning of String
        if (value < 0) {
            sb.append("-");
        }

        // Add each digit to the String
        for(Integer digit : octal) {
            sb.append(digit);
        }

        return sb.toString();
    }

    public String toHexadecimal() {
        if (value == 0) {
            return "0";
        }

        int decimalValue = value;

        // Array to store the letters if dividing the number by 16 returns 10+
        String[] beyondNine = {"A", "B", "C", "D", "E", "F"};

        // Convert to positive if value is negative
        if (decimalValue < 0) {
            decimalValue *= -1;
        }

        ArrayList<Integer> hexadecimal = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // Formula
        // Start at last digit, divide by 16 and get the remainder for each
        // 10 = A -- 11 = B -- 12 = C -- 13 = D -- 14 = E -- 15 = F
        while (decimalValue >= 1) {
            hexadecimal.add(decimalValue % 16);
            decimalValue /= 16;
        }

        // Reverse the ArrayList to get the hexadecimal representation
        Collections.reverse(hexadecimal);

        // If value was negative, add negative sign at beginning of String
        if (value < 0) {
            sb.append("-");
        }

        for(Integer digit : hexadecimal) {
            if (digit > 9) {
                sb.append(beyondNine[digit - 10]);
            } else {
                sb.append(digit);
            }
        }

        return sb.toString();
    }

    public String toString() {
        return "Decimal: " + value + "\n" +
                "Binary: " + toBinary() + "\n" +
                "Octal: " + toOctal() + "\n" +
                "Hexadecimal: " + toHexadecimal();
    }
}
