/*  Leetcode question 9: Palindrome Number

    Given an integer x, return true if x is a palindrome, and false otherwise.

    An integer is a palindrome when it reads the same backward as forward. For example, 121 is a palindrome while 123 is not.

*/
public class IsPalindrome {
    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }

        int div = 1;

        while(x >= 10 * div){
            div *= 10;
        }

        while (x != 0){
            int right = x % 10;
            int left = x / div;

            if(left != right){
                return false;
            }

            x = (x % div)/10;
            div /= 100;
        }

        return true;
    }
}
