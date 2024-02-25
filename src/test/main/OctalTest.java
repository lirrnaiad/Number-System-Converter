package main;

import main.NumberSystems.Octal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OctalTest {
    final String octal_MAX = "17777777777";

    // DECIMAL TESTS
    @Test
    public void toDecimalZero() {
        Octal octalNum = new Octal("0");
        assertEquals("0", octalNum.toDecimal());
    }

    @Test
    public void toDecimal1() {
        Octal octalNum = new Octal("452011542");
        assertEquals("78123874", octalNum.toDecimal());
    }

    @Test
    public void toDecimal2() {
        Octal octalNum = new Octal("2610120033");
        assertEquals("371236891", octalNum.toDecimal());
    }

    @Test
    public void toDecimalMaxInteger() {
        Octal octalNum = new Octal(octal_MAX);
        assertEquals("2147483647", octalNum.toDecimal());
    }

    // BINARY TESTS
    @Test
    public void toBinaryZero() {
        Octal octalNum = new Octal("0");
        assertEquals("0", octalNum.toBinary());
    }

    @Test
    public void toBinary1() {
        Octal octalNum = new Octal("3124125123");
        assertEquals("11001010100001010101001010011", octalNum.toBinary());
    }

    @Test
    public void toBinary2() {
        Octal octalNum = new Octal("656612");
        assertEquals("110101110110001010", octalNum.toBinary());
    }

    @Test
    public void toBinaryMaxInteger() {
        Octal octalNum = new Octal(octal_MAX);
        assertEquals("1111111111111111111111111111111", octalNum.toBinary());
    }


    // HEXADECIMAL TESTS
    @Test
    public void toHexadecimalZero() {
        Octal octalNum = new Octal("0");
        assertEquals("0", octalNum.toHexadecimal());
    }

    @Test
    public void toHexadecimal1() {
        Octal octalNum = new Octal("41761123");
        assertEquals("87E253", octalNum.toHexadecimal());
    }

    @Test
    public void toHexadecimal2() {
        Octal octalNum = new Octal("6142631");
        assertEquals("18C599", octalNum.toHexadecimal());
    }

    @Test
    public void toHexadecimalMaxInteger() {
        Octal octalNum = new Octal(octal_MAX);
        assertEquals("7FFFFFFF", octalNum.toHexadecimal());
    }
}