package csinfo360com.Crackingthecodinginterview.step5;

public class EvenDigitsSum {
    /*
Even Digits' Sum:
In mathematics, the "digit sum" of a given integer is the sum of all its digits, e.g.
the digit sum of 84001 is calculated as 8+4+0+0+1 = 13,
the digit sum of 158 is 1+5+8 = 14.
Rohan's teacher has asked him to write a function (method) that takes as input a positive number and performs digitSum of only the even digits in the given number.
Example 1: If the given number is 9625, we must add only the even digits, i.e. 6+2 = 8 Thus, the EvenDigitsSum for the number 9625 is 8.
Example 2: If the given number is 2134, the EvenDigitsSum will be 2+4 = 6
Assumption: The input number will be a positive integer number >= 1 and <= 25000.
     */
    public static void main(String[] args) {
        int num = 9625;
        int evenSum = 0;
        int sum = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum = sum + remainder;
            if (remainder % 2 == 0) {
                evenSum = evenSum + remainder;
            }
                num = num / 10;
            }
        System.out.println(evenSum);
      //  System.out.println(sum);
        }
    }