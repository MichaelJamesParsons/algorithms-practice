package IntegerToEnglishWords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerToEnglishWordsTests {
    private IntegerToEnglishWords converter;

    @BeforeEach
    void init () {
        this.converter = new IntegerToEnglishWords();
    }

    @Test
    void testZero () {
        Assertions.assertEquals("Zero", this.converter.numberToWords(0));
    }

    @Test
    void testOnes () {
        Assertions.assertEquals("One", this.converter.numberToWords(1));
        Assertions.assertEquals("Two", this.converter.numberToWords(2));
        Assertions.assertEquals("Three", this.converter.numberToWords(3));
        Assertions.assertEquals("Four", this.converter.numberToWords(4));
        Assertions.assertEquals("Five", this.converter.numberToWords(5));
        Assertions.assertEquals("Six", this.converter.numberToWords(6));
        Assertions.assertEquals("Seven", this.converter.numberToWords(7));
        Assertions.assertEquals("Eight", this.converter.numberToWords(8));
        Assertions.assertEquals("Nine", this.converter.numberToWords(9));
    }

    @Test
    void testTeens () {
        Assertions.assertEquals("Ten", this.converter.numberToWords(10));
        Assertions.assertEquals("Eleven", this.converter.numberToWords(11));
        Assertions.assertEquals("Twelve", this.converter.numberToWords(12));
        Assertions.assertEquals("Thirteen", this.converter.numberToWords(13));
        Assertions.assertEquals("Fourteen", this.converter.numberToWords(14));
        Assertions.assertEquals("Fifteen", this.converter.numberToWords(15));
        Assertions.assertEquals("Sixteen", this.converter.numberToWords(16));
        Assertions.assertEquals("Seventeen", this.converter.numberToWords(17));
        Assertions.assertEquals("Eighteen", this.converter.numberToWords(18));
        Assertions.assertEquals("Nineteen", this.converter.numberToWords(19));
    }

    @Test
    void testHundreds () {
        Assertions.assertEquals("One Hundred", this.converter.numberToWords(100));
        Assertions.assertEquals("One Hundred One", this.converter.numberToWords(101));
        Assertions.assertEquals("One Hundred Seventeen", this.converter.numberToWords(117));
        Assertions.assertEquals("Nine Hundred Ninety Nine", this.converter.numberToWords(999));
    }

    @Test
    void testThousands () {
        Assertions.assertEquals("One Thousand", this.converter.numberToWords(1000));
        Assertions.assertEquals("Nine Thousand Nine Hundred Ninety Nine", this.converter.numberToWords(9999));
        Assertions.assertEquals("Twenty Thousand", this.converter.numberToWords(20000));
        Assertions.assertEquals("Nine Hundred Ninety Nine Thousand Nine Hundred Ninety Nine", this.converter.numberToWords(999999));
    }

    @Test
    void testMillions () {
        Assertions.assertEquals("One Million", this.converter.numberToWords(1000000));
        Assertions.assertEquals("Nine Hundred Ninety Nine Million Nine Hundred Ninety Nine Thousand Nine Hundred Ninety Nine", this.converter.numberToWords(999999999));
    }

    @Test
    void testMaxInt () {
        Assertions.assertEquals("Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven", this.converter.numberToWords(2147483647));
    }
}
