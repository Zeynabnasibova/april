package csinfo360com.numbersProgrammingQuestions;

import java.util.Scanner;

public class Largest2digit {
    /*
    Find 2nd largest digit in a given number
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        System.out.println(largestSecond(number));

    }

    public static int largestSecond(int num ){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        while (num != 0){
            int remainder = num % 10;
            if(remainder > max){
                max = remainder;
            }else if(remainder > secondMax){
                secondMax = remainder;
            }
            num = num / 10;
        }
        return secondMax;
    }

}
