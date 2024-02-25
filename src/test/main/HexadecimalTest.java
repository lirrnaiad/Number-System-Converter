package main;

import main.NumberSystems.Hexadecimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexadecimalTest {
    String hexadecimal_MAX = "7FFFFFFF";

    // DECIMAL TESTS
    @Test
    public void toDecimalZero() {
        Hexadecimal hexNumber = new Hexadecimal("0");
        assertEquals("0", hexNumber.toDecimal());
    }

    @Test
    public void toDecimal1() {
        Hexadecimal hexNumber = new Hexadecimal("2B96321E");
        assertEquals("731263518", hexNumber.toDecimal());
    }

    @Test
    public void toDecimal2() {
        Hexadecimal hexNumber = new Hexadecimal("ABCDEF");
        assertEquals("11259375", hexNumber.toDecimal());
    }

    @Test
    public void toDecimalMaxInteger() {
        Hexadecimal hexNumber = new Hexadecimal(hexadecimal_MAX);
        assertEquals("2147483647", hexNumber.toDecimal());
    }


    // BINARY TESTS
    @Test
    public void toBinaryZero() {
        Hexadecimal hexNumber = new Hexadecimal("0");
        assertEquals("0", hexNumber.toBinary());
    }

    @Test
    public void toBinary1() {
        Hexadecimal hexNumber = new Hexadecimal("78BBCA");
        assertEquals("11110001011101111001010", hexNumber.toBinary());
    }

    @Test
    public void toBinary2() {
        Hexadecimal hexNumber = new Hexadecimal("BBADF");
        assertEquals("10111011101011011111", hexNumber.toBinary());
    }

    @Test
    public void toBinaryMaxInteger() {
        Hexadecimal hexNumber = new Hexadecimal(hexadecimal_MAX);
        assertEquals("1111111111111111111111111111111", hexNumber.toBinary());
    }


    // OCTAL TESTS
    @Test
    public void toOctalZero() {
        Hexadecimal hexNumber = new Hexadecimal("0");
        assertEquals("0", hexNumber.toOctal());
    }

    @Test
    public void toOctal1() {
        Hexadecimal hexNumber = new Hexadecimal("3AFD7");
        assertEquals("727727", hexNumber.toOctal());
    }

    @Test
    public void toOctal2() {
        Hexadecimal hexNumber = new Hexadecimal("199B93");
        assertEquals("6315623", hexNumber.toOctal());
    }

    @Test
    public void toOctalMaxInteger() {
        Hexadecimal hexNumber = new Hexadecimal(hexadecimal_MAX);
        assertEquals("17777777777", hexNumber.toOctal());
    }
}