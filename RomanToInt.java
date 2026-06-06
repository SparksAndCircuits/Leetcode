import java.util.HashMap;
/*  Leetcode question 13: Roman to Integer

    Roman numerals are repesented by seven different symbols: I, V, X, L, C, D and M.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII. Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX.

    Given a roman numeral, convert it to an integer.
*/
public class RomanToInt {
    public int romanToInt(String s){
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int res = 0;

        for(int i = 0; i < s.length(); i++){
            int valueOfCurrChar = roman.get(s.charAt(i));

            if(i + 1 < s.length() && valueOfCurrChar < roman.get(s.charAt(i + 1))){
                res -= valueOfCurrChar;
            }else{
                res += valueOfCurrChar;
            }
        }

        return res;
    }
}
