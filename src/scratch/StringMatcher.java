package scratch;

import java.util.Objects;

public class StringMatcher {
    private final String[] arr;
    public StringMatcher(String[] arr) {
        this.arr = arr;
    }

    public int findString(String toLookFor) {
        for (int c = 0; c < arr.length; c++) {
            if (Objects.equals(arr[c], toLookFor)) {
                return c;
            }
        }
        return -1;
    }
}
