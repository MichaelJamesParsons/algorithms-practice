package FizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class FizzBuzzTests {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void init () {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    void example1 () {
        List<String> result = this.fizzBuzz.fizzBuzz(15);

        Assertions.assertEquals("1", result.get(0));
        Assertions.assertEquals("2", result.get(1));
        Assertions.assertEquals("Fizz", result.get(2));
        Assertions.assertEquals("4", result.get(3));
        Assertions.assertEquals("Buzz", result.get(4));
        Assertions.assertEquals("Fizz", result.get(5));
        Assertions.assertEquals("7", result.get(6));
        Assertions.assertEquals("8", result.get(7));
        Assertions.assertEquals("Fizz", result.get(8));
        Assertions.assertEquals("Buzz", result.get(9));
        Assertions.assertEquals("11", result.get(10));
        Assertions.assertEquals("Fizz", result.get(11));
        Assertions.assertEquals("13", result.get(12));
        Assertions.assertEquals("14", result.get(13));
        Assertions.assertEquals("FizzBuzz", result.get(14));
    }
}
