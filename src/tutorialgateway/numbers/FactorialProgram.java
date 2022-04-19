package tutorialgateway.numbers;

import java.util.Scanner;

public class FactorialProgram {
    //5 = 1 * 2 * 3* 4* 5 = 24 * 5= 120

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        System.out.println(factorial(number));
    }
    public static int factorial(int number){
        int factorial = 1;
        for(int i  = 1; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }

}
