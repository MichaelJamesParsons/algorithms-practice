package UniqueString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UniqueStringTests {
    private UniqueString uniqueString;

    @BeforeEach
    void init () {
        this.uniqueString = new UniqueString();
    }

    @Test
    void emptyString () {
        Assertions.assertTrue(this.uniqueString.isUnique(""));
    }

    @Test
    void singleCharString () {
        Assertions.assertTrue(this.uniqueString.isUnique("a"));
    }

    @Test
    void nonUniqueString () {
        Assertions.assertFalse(this.uniqueString.isUnique("abcad"));
    }

    @Test
    void uniqueString () {
        Assertions.assertTrue(this.uniqueString.isUnique("abcd"));
    }
}
