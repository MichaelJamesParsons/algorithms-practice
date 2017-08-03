package RomanToInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanToIntegerTests {
    private RomanToInteger converter;

    @BeforeEach
    void init () {
        this.converter = new RomanToInteger();
    }

    @Test
    void testOne () {
        Assertions.assertEquals(1, this.converter.romanToInt("I"));
    }

    @Test
    void testTwo () {
        Assertions.assertEquals(2, this.converter.romanToInt("II"));
    }

    @Test
    void testFour () {
        Assertions.assertEquals(4, this.converter.romanToInt("IV"));
    }

    @Test
    void testNine () {
        Assertions.assertEquals(9, this.converter.romanToInt("IX"));
    }

    @Test
    void testMaxInt () {
        Assertions.assertEquals(3999, this.converter.romanToInt("MMMCMXCIX"));
    }
}
