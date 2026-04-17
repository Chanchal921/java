package bill;

import java.util.*;

public class genericno {

    // Generic method
    public static <T extends Number> void sumEvenOdd(List<T> list) {

        double evenSum = 0;
        double oddSum = 0;

        for (T num : list) {
            int value = num.intValue(); // convert to int

            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        sumEvenOdd(numbers);
    }
}