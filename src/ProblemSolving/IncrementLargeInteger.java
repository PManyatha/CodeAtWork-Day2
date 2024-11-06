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
        int[] arr =solution.plusOne(solution.plusOne(new int[]{9,9,9}));
        System.out.println(Arrays.toString(arr));
    }
}

