package tutorialgateway.numbers;

import java.util.Scanner;

public class LastDigitOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        System.out.println("First Digit = "+firstDigit(number));
        System.out.println("Last Digit =" + lastDigit(number));
    }

    public static int firstDigit(int num){
        while(num >= 10){
            num = num / 10;
        }
        return num;
    }

    public static int lastDigit(int num){
        int last = num % 10 ;
        return last;
    }
}
