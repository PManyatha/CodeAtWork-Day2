package ProblemSolving;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String prefix = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(prefix);
    }

}

/*
 Test cases
      Input                                  Output

 1   ["dog", "racecar", "car"]                 ""
 2   ["interview", "interact", "internet"]    "inte"
 3   ["hello", "hey", "he"]                   "he"
 4   ["", "test", "testing"]                  ""
 5   ["same", "same", "same"]                 "same"
 6   ["a", "b", "c"]                          ""
 7  ["single"]                                "single"
 8  ["", ""]                                  ""
 9  ["abcd", "abc", "ab", "a"]                "a"
 10  ["aa", "ab"]                             "a"
 11  ["none", "match", "here"]                 ""
*/

