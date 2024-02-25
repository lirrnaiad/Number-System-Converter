package main;

import main.NumberSystems.Decimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalTest {

    // BINARY TESTS
    @Test
    public void toBinaryZero() {
        Decimal decimalNum = new Decimal(0);
        assertEquals("0", decimalNum.toBinary());
    }

    @Test
    public void toBinary1() {
        Decimal decimalNum = new Decimal(466);
        assertEquals("111010010", decimalNum.toBinary());
    }

    @Test
    public void toBinary2() {
        Decimal decimalNum = new Decimal(2794);
        assertEquals("101011101010", decimalNum.toBinary());
    }

    @Test
    public void toBinaryMaxValueInteger() {
        Decimal decimalNum = new Decimal(Integer.MAX_VALUE);
        assertEquals("1111111111111111111111111111111", decimalNum.toBinary());
    }

    @Test
    public void toBinaryNegativeDecimal() {
        Decimal decimalNum = new Decimal(-7243567);
        assertEquals("-11011101000011100101111", decimalNum.toBinary());
    }


    // OCTAL TESTS
    @Test
    public void toOctalZero() {
        Decimal decimalNum = new Decimal(0);
        assertEquals("0", decimalNum.toOctal());
    }

    @Test
    public void toOctal1() {
        Decimal decimalNum = new Decimal(3584);
        assertEquals("7000", decimalNum.toOctal());
    }

    @Test
    public void toOctal2() {
        Decimal decimalNum = new Decimal(827312);
        assertEquals("3117660", decimalNum.toOctal());
    }

    @Test
    public void toOctalMaxValueInteger() {
        Decimal decimalNum = new Decimal(Integer.MAX_VALUE);
        assertEquals("17777777777", decimalNum.toOctal());
    }

    @Test
    public void toOctalNegativeDecimal() {
        Decimal decimalNum = new Decimal(-8518241);
        assertEquals("-40375141", decimalNum.toOctal());
    }


    // HEXADECIMAL TESTS
    @Test
    public void toHexadecimalZero() {
        Decimal decimalNum = new Decimal(0);
        assertEquals("0", decimalNum.toHexadecimal());
    }

    @Test
    public void toHexadecimal1() {
        Decimal decimalNum = new Decimal(412634);
        assertEquals("64BDA", decimalNum.toHexadecimal());
    }

    @Test
    public void toHexadecimal2() {
        Decimal decimalNum = new Decimal(723912356);
        assertEquals("2B2606A4", decimalNum.toHexadecimal());
    }

    @Test
    public void toHexadecimalMaxValueInteger() {
        Decimal decimalNum = new Decimal(2147483647);
        assertEquals("7FFFFFFF", decimalNum.toHexadecimal());
    }

    @Test
    public void toHexadecimalNegativeDecimal() {
        Decimal decimalNum = new Decimal(-781624);
        assertEquals("-BED38", decimalNum.toHexadecimal());
    }
}