/*  Leetcode question 14: Longest Common Prefix

    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".
*/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        String res = "";

        for(int i = 0; i < strs[0].length(); i++){
            for(String s : strs){
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i)){
                    return res;
                }
            }

            res += strs[0].charAt(i);
        }

        return res;
    }
}
