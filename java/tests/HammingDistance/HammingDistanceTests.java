package HammingDistance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HammingDistanceTests {
    private HammingDistance distance;

    @BeforeEach
    void init () {
        this.distance = new HammingDistance();
    }

    @Test
    void example1 () {
        Assertions.assertEquals(2, this.distance.hammingDistance(1,4));
    }

    @Test
    void example2 () {
        Assertions.assertEquals(2, this.distance.hammingDistance(6,4));
    }
}
