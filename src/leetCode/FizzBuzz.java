package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<>(n);
        for (int c = 1; c <= n; c++) {
            String indexString = "";
            if (c % 3 == 0) {
                indexString = "Fizz";
            }
            if (c % 5 == 0) {
                indexString += "Buzz";
            }
            if (indexString.equals("")) {
                indexString = c + "";
            }
            answer.add(indexString);
        }
        return answer;
    }
    public List<String> fizzBuzzBetter(int n) {
        ArrayList<String> answer = new ArrayList<>(n);

        int c, i = 0;  // index

        while (i <= n - 15) {
            c = 0;
            while (c < 15) {
                int baseIndex = i + c;
                answer.add((baseIndex + 1) + "");
                answer.add((baseIndex + 2) + "");
                answer.add("Fizz");
                c += 3;
            }
            answer.set(i + 4, "Buzz");
            answer.set(i + 9, "Buzz");
            answer.set(i + 14, "leetCode.FizzBuzz");
            i += 15;
        }
        for (int j = 1; j <= n % 15; j++) {
            String indexString = "";
            if (j % 3 == 0) {
                indexString = "Fizz";
            }
            if (j % 5 == 0) {
                indexString += "Buzz";
            }
            if (indexString.equals("")) {
                indexString = j + i + "";
            }
            answer.add(indexString);
        }
        return answer;
    }
}