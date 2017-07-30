package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int x = 1; x <= n; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                result.add("FizzBuzz");
            } else if (x % 3 == 0) {
                result.add("Fizz");
            } else if (x % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(x + "");
            }
        }

        return result;
    }
}
