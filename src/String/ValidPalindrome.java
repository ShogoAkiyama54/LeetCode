package String;

/**
 * @author Shogo Akiyama 
 * Solved on 08/30/2019
 * 
 * 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - boolean isPalindrome(String s).
 * 
 * Runtime: 5 ms, faster than 54.76% of Java online submissions for Valid Palindrome.
 * Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Valid Palindrome.
 * 
 */

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        s=s.toLowerCase();
        boolean skip = false;
        
        while(i<j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!Character.isLetterOrDigit(c1)){
                i++;
                skip = true;
            }
            if(!Character.isLetterOrDigit(c2)){
                j--;
                skip = true;
            }
            if(skip){
                skip = false;
                continue;
            }
            if(c1 != c2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
	
}
