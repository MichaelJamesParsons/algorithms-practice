package IntegerToRoman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerToRomanTests {
    private IntegerToRoman intToRoman;

    @BeforeEach
    void init() {
        this.intToRoman = new IntegerToRoman();
    }

    @Test
    void testOne() {
        Assertions.assertEquals("I", this.intToRoman.intToRoman(1));
    }

    @Test
    void testFive() {
        Assertions.assertEquals("V", this.intToRoman.intToRoman(5));
    }

    @Test
    void testTen() {
        Assertions.assertEquals("X", this.intToRoman.intToRoman(10));
    }

    @Test
    void testFifty() {
        Assertions.assertEquals("L", this.intToRoman.intToRoman(50));
    }

    @Test
    void testOneHundred() {
        Assertions.assertEquals("C", this.intToRoman.intToRoman(100));
    }

    @Test
    void testFiveHundred() {
        Assertions.assertEquals("D", this.intToRoman.intToRoman(500));
    }

    @Test
    void testOneThousand() {
        Assertions.assertEquals("M", this.intToRoman.intToRoman(1000));
    }

    @Test
    void testFortyNine() {
        Assertions.assertEquals("XLIX", this.intToRoman.intToRoman(49));
    }

    @Test
    void testThreeThousandNineHundredNintyNine() {
        Assertions.assertEquals("MMMCMXCIX", this.intToRoman.intToRoman(3999));
    }
}
