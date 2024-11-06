package ProblemSolving;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestValidParentheses solution = new LongestValidParentheses();
        int length = solution.longestValidParentheses(")()())");
        System.out.println(length);
    }
}

/* Test cases
      Input         Output
 1   ()(()))          6
 2   ()               2
 3   ""               0
 4   ()()()           6
 5   ((((             0
 6   ))))             0
 7   (()))(()         4
 8  ()())()          4
 */
