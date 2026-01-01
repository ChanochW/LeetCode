package leetCode;

import java.util.Arrays;

public class Fibonacci {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        // initialize base case variables
        int a = 0, b = 1;
        int sum = 0;

        while (n > 1) {
            // calculate next value as the sum of previous two values
            sum = a + b;

            // switch all values to the next value in the series
            a = b;
            b = sum;

            // decrement counter
            n -= 1;
        }

        return sum;
    }
}

class AdinaFibonacci {
    public static void main(String[] args) {

        //number of elements to generate in the sequence
        int max = 15;

        // create the array to hold the sequence of Fibonacci numbers
        int[] sequence = new int[max];
        //create the first 2 Fibonacci sequence elements
        sequence[0] = 0;
        sequence[1] = 1;

        //create the Fibonacci sequence and store it in int[] sequence
        int currentNum = 2;

        while (currentNum < max) {
            sequence[currentNum] = sequence[currentNum - 1] + sequence[currentNum - 2];
            currentNum++;
        }

        //print the Fibonacci sequence numbers
        System.out.println("The first 15 elements in the Fiboncacci sequence are:\n" +
                Arrays.toString(sequence).replace("[", "").replace("]", "").replace(",", "") +
                "\nThe element after 55 is " + findNextElement(sequence, 55));
    }

    //This method returns the element that comes after element 'toFind'
    public static int findNextElement(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return arr[i] + arr[i - 1];
            }
        }
        return -1;
    }
}
