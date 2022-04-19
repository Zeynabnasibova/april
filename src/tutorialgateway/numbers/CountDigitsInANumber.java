package tutorialgateway.numbers;

import java.util.Scanner;

public class CountDigitsInANumber {//123 = 1+2+3 = 6

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        System.out.println(count(number));

    }
    public static  int count(int number) {
        int count = 0;
        while (number != 0) {
            int remainder = number % 10;
       count++;
            number = number / 10;
        }
return count;
    }
}
