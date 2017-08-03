package ZigZagConversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZigZagConversionTests {
    private ZigZagConversion converter;

    @BeforeEach
    void init() {
        this.converter = new ZigZagConversion();
    }

    @Test
    void testExample1() {
        Assertions.assertEquals("PAHNAPLSIIGYIR", this.converter.convert("PAYPALISHIRING", 3));
    }
}
