package main;

import main.NumberSystems.Binary;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class BinaryTest {
    final String binary_MAX = "1111111111111111111111111111111";

    @Test
    public void convertToListSuccessful() {
        Binary binaryNum = new Binary("110011001");
        assertEquals(Arrays.asList(1, 1, 0, 0, 1, 1, 0, 0, 1), binaryNum.convertStringToList());
    }

    // DECIMAL TESTS
    @Test
    public void toDecimalZero() {
        Binary binaryNum = new Binary("0");
        assertEquals("0", binaryNum.toDecimal());
    }

    @Test
    public void toDecimal1() {
        Binary binaryNum = new Binary("10101010001010001001");
        assertEquals("696969", binaryNum.toDecimal());
    }

    @Test
    public void toDecimal2() {
        Binary binaryNum = new Binary("11110100010010100010100111000");
        assertEquals("512312632", binaryNum.toDecimal());
    }

    @Test
    public void toDecimalMaxInteger() {
        Binary binaryNum = new Binary(binary_MAX);
        assertEquals("2147483647", binaryNum.toDecimal());
    }


    // OCTAL TESTS
    @Test
    public void toOctalZero() {
        Binary binaryNum = new Binary("0");
        assertEquals("0", binaryNum.toOctal());
    }

    @Test
    public void toOctal1() {
        Binary binaryNum = new Binary("1001010011001010101001010");
        assertEquals("112312512", binaryNum.toOctal());
    }

    @Test
    public void toOctal2() {
        Binary binaryNum = new Binary("110001011001001010");
        assertEquals("613112", binaryNum.toOctal());
    }

    @Test
    public void toOctalMaxInteger() {
        Binary binaryNum = new Binary(binary_MAX);
        assertEquals("17777777777", binaryNum.toOctal());
    }


    // HEXADECIMAL TESTS
    @Test
    public void toHexadecimalZero() {
        Binary binaryNum = new Binary("0");
        assertEquals("0", binaryNum.toHexadecimal());
    }

    @Test
    public void toHexadecimal1() {
        Binary binaryNum = new Binary("10101011110101");
        assertEquals("2AF5", binaryNum.toHexadecimal());
    }

    @Test
    public void toHexadecimal2() {
        Binary binaryNum = new Binary("1011111010100101101011011101010");
        assertEquals("5F52D6EA", binaryNum.toHexadecimal());
    }

    @Test
    public void toHexadecimalMaxInteger() {
        Binary binaryNum = new Binary(binary_MAX);
        assertEquals("7FFFFFFF", binaryNum.toHexadecimal());
    }
}