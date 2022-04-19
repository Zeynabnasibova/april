package leetcodeCom;

public class PalindromeNumber9 {
    /*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

     */

    public static boolean isPalindrome(int x) {
        int temp = x;
        if(x < 0){
            return false;
        }else{
            if(temp == reverse(x)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static int reverse(int x){

      long reverse = 0;
            while(x != 0){
                int remainder = x % 10;
                reverse = reverse * 10 + remainder;
                x = x / 10;
                if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
                    return 0;

            }
        return (int) reverse;
    }


}
/*
class Solution {
    public boolean isPalindrome(int x) {
      //  123
    int reverse = 0;//3
        if(x < 0){
            return false;
        }
        int number = x;
        while(x > 0){
            int remainder = x % 10;//123 % 10 = 3 //12 % 10 = 2
    reverse = reverse * 10 + remainder; // 0 + 3=3// 3*10+2 = 32
                x = x / 10; // 123 / 10 = 12 //12/10 = 1
        }
        if(reverse == number){

        return true;
        }  else{
            return false;
        }
}
}
 */