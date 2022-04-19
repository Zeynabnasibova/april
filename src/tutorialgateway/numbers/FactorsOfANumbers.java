package tutorialgateway.numbers;

import java.util.Scanner;

public class FactorsOfANumbers {
    //30 / 1
    // 30 / 2
    //30 / 5
    //30 / 6
    // 30 / 15
    //30 /30
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
factor(number);
    }
    public static void factor(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i + " ");
            }
        }
    }

}
