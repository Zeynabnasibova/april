package tutorialgateway.numbers;

import java.util.Scanner;

public class FirstDigitOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        System.out.println(firstNumber(number));

//
//        int num = 1234;
//        int first = num / 100;
//        System.out.println(first);
//        while (number >= 10){ // 1234 > = 1234, 123 >= 10, 12 >= 10
//
//           number = number / 10;// 1234 / 10 = 123, 123 / 10 = 12, 12 / 10 = 1
//        }
//        System.out.println(number );
    }


    public static int firstNumber (int number){
        while (number >= 10){ // 1234 > = 1234, 123 >= 10, 12 >= 10

            number = number / 10;// 1234 / 10 = 123, 123 / 10 = 12, 12 / 10 = 1
        }
        return number;

    }
}