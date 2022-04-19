package csinfo360com.Crackingthecodinginterview.step1;

public class Q4 {
    /*
    Question 4:

Return the second last digit of the given number.

Write a function that returns the second last digit of the given number. The second last digit is being referred to the digit in the tens place in the given number.
For example, if the given number is 197, the second last digit is 9
Note 1 - The second last digit should be returned as a positive number. i.e. if the given number is -197, the second last digit is 9
Note 2 - If the given number is a single-digit number, then the second last digit does not exist. In such cases, the function should return -1. i.e. if the given number is 5, the second last digit should be returned as -1.
     */
    public static void main(String[] args) {
        System.out.println(secondLast(-140));
    }

    public static int secondLast(int num) {
        //   int num = -157;
        int second = 0;
        int count = 0;
        if (num >= -9 && num < 9) {
            return -1;
        }   if (num < 0) {
                num = num * (-1);
                while (num != 0) {
                    int remainder = num % 10;
                    count++;
                    if (count == 2) {
                        second = remainder;
                    }
                    num = num / 10;
                }
         }
        return second;

        }

    }

