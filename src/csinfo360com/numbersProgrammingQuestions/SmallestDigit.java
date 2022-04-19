package csinfo360com.numbersProgrammingQuestions;

import java.util.Scanner;

public class SmallestDigit {
/*
Find the Smallest digit in a number

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        System.out.println(smallest(num));
    }

    public static int smallest(int num) {

        int min  = Integer.MAX_VALUE;
        while (num != 0){
            int remainder = num % 10;
            if(remainder < min){
                min = remainder;
            }
            num = num / 10;
        }
        return min;
    }
}