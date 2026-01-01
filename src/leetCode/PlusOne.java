package leetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(array)));
    }
    public static int[] plusOne(int[] digits) {
        StringBuilder number = new StringBuilder();
        for (int digit : digits) {
            number.append(digit);
        }
        BigInteger number1 = new BigInteger(String.valueOf(number), 10);
        BigInteger toAdd = new BigInteger("1", 10);
        String holder = number1.add(toAdd).toString();
        int[] toReturn = new int[holder.length()];
        for (int c = 0; c < holder.length(); c++) {
            toReturn[c] = Integer.parseInt(holder.charAt(c) + "");
        }
        return toReturn;
    }
}
