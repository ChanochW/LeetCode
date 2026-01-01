package leetCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FizzBuzzTest {
    @Test
    void test() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> test = fizzBuzz.fizzBuzzBetter(18);
        for (String str:test) {
            System.out.print(str + ", ");
        }
    }
}
