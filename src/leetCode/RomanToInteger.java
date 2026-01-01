package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    private Map<Character, Integer> dict = new HashMap<>();

    public RomanToInteger() {
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
    }

    public int RomanToInt(String s) {

        char[] ch = s.toCharArray();

        int result = 0;
        int intVal,nextIntVal;

        for(int i = 0; i <ch.length ; i++){
            intVal = dict.get(ch[i]);

            if(i != ch.length-1)
            {
                nextIntVal = dict.get(ch[i]);

                if(nextIntVal>intVal){
                    intVal = nextIntVal-intVal;
                    i = i+1;
                }
            }
            result = result + intVal;
        }
        return result;
    }
}
