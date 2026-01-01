package scratch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringMatcherTest {
    private final String[] arr = {"Hello", "Karel", "CodeHS", "Karel"};
    private final StringMatcher matcher = new StringMatcher(arr);
    @Test
    public void matchTest() {
        assertEquals(0, matcher.findString("Hello"));
        assertEquals(1, matcher.findString("Karel"));
        assertEquals(-1, matcher.findString("Bob"));
    }
}
