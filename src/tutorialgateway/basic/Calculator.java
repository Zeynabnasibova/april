package tutorialgateway.basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Enter operator");
        char operator = input.next().charAt(0);
        int result = 0;
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result =num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("You have entered incorrect operator");
        }
        System.out.println(result);


    }
}
