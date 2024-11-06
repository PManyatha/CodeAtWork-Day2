package ProblemSolving;

public class SortNumbers {
    public void sortNum(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap to move 0 to the low end
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++; // Just move mid pointer if it's 1
            } else {
                // Swap to move 2 to the high end
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

