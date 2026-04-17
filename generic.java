package bill;

import java.util.Arrays;

public class generic {

    // Generic method
    public static <T> boolean areArraysEqual(T[] arr1, T[] arr2) {

        // Check length first
        if (arr1.length != arr2.length) {
            return false;
        }

        // Compare elements
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {1, 2, 3};

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "D"};

        System.out.println("Integer arrays equal: " + areArraysEqual(a1, a2));
        System.out.println("String arrays equal: " + areArraysEqual(s1, s2));
    }
}