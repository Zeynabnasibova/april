package tutorialgateway.numbers;

import java.util.Scanner;

public class BreakIntegerIntoDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
    breakIntegerToDigit(number);
    }

    public static void breakIntegerToDigit(int number  ){//123

//        while(number != 0){
//            int remainder = number % 10;
//            reverse = reverse * 10 + remainder;
//            number = number / 10;
//        }
//
int count = 0;

for(int temp = number; temp != 0; count++){
    temp = temp / 10;
}
     for(int i =  number; number != 0;number = number / 10){
         int remainder = number % 10;
         System.out.println("Digit at Pissition " + count + " = " + remainder );
         count--;

     }

    }


}
