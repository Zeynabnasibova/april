package csinfo360com.Crackingthecodinginterview.step1;

public class Q3 {
    /*
    Question 3:

Return the last digit of the given number.

Write a function that returns the last digit of the given number. The last digit is being referred to the least significant digit i.e the digit in the ones(units) place in the number.
The last digit should be returned as a positive number.
for example,
if the given number is 197, the last digit is 7
if the given number is -197, the last digit is 7
     */
    public static void main(String[] args) {
        int num = -17;
        int last = 0;
        int count = 0;
        if(num < 0){
            num = num * (-1);
            while (num != 0) {
                int remainder = num % 10;
                count++;
                if (count == 1) {
                    last = remainder;
                }
                num = num / 10;
            }
            System.out.println(last);
        }

        }
    }
