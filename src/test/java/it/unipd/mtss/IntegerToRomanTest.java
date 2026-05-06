////////////////////////////////////////////////////////////////////
// Alessandro Ravenna 2111930
// Eleonora Bellet 2111002
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertNumberUnderOneThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
    }

    @Test
    public void testConvertNumberOverOneThousandThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(1001));
    }

    @Test
    public void testConvertFirstThreeNumbers() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvertFirstSixNumbers() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvertFirstTenNumbers() {
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvertFirstTwentyNumbers() {
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testConvertFirstFiftyNumbers() {
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIX", IntegerToRoman.convert(49));
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvertFirstOneHundredNumbers() {
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvertFirstFiveHundredNumbers() {
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("CDXCIX", IntegerToRoman.convert(499));
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvertFirstOneThousandNumbers() {
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        assertEquals("M", IntegerToRoman.convert(1000));

    }
}