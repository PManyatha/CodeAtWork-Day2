package ProblemSolving;

import java.util.Arrays;
public class IncrementLargeInteger {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }


        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        IncrementLargeInteger solution = new IncrementLargeInteger();

        int[] arr1 = solution.plusOne(new int[]{1, 2, 3});
        System.out.println("Incrementing [1, 2, 3]: " + Arrays.toString(arr1));

        int[] arr2 = solution.plusOne(new int[]{4, 3, 2, 1});
        System.out.println("Incrementing [4, 3, 2, 1]: " + Arrays.toString(arr2));

        int[] arr3 = solution.plusOne(new int[]{9, 9, 9});
        System.out.println("Incrementing [9, 9, 9]: " + Arrays.toString(arr3));

        int[] arr4 = solution.plusOne(new int[]{1, 1, 9});
        System.out.println("Incrementing [1, 1, 9]: " + Arrays.toString(arr4));

        int[] arr5 = solution.plusOne(new int[]{});
        System.out.println("Incrementing []: " + Arrays.toString(arr5));
    }
}

/* Test cases
      Input         Output
 1  [1, 2, 9]      [1, 3, 0]
 2  [9, 9, 9]      [1, 0, 0, 0]
 3  [5]            [6]
 4  [9]            [1,0]
 5  [0, 0, 0]      [0,0,1]
 6  [1, 0, 0, 9]   [1, 0, 1, 0]
 7  []             [1]
 8  [9, 9, 9, 9, 9, 9, 9, 9, 9, 9]   [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 9
 10
 */