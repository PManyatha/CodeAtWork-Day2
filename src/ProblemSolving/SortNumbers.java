package ProblemSolving;

public class SortNumbers {
    public void sortNum(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        SortNumbers solver = new SortNumbers();
        solver.sortNum(new int[]{0, 1, 2, 1, 0, 2, 1, 0});

    }
}

/* Test cases
      Input         Output
 1    [0, 0, 0]                  [0, 0, 0]
 2    [2, 0, 1]                  [0, 1, 2]
 3    [0, 2, 0, 2, 1, 1]         [0, 0, 1, 1, 2, 2]
 4    [1, 2, 1, 0, 0, 1, 2, 0]   [0, 0, 0, 1, 1, 1, 2, 2]
 5    [0, 1, 2]                  [0, 1, 2]
 6   [2, 2, 1, 1, 0, 0]         [0, 0, 1, 1, 2, 2]
 */

