package tutorialgateway.basic;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Value =  ");
        int num1 = input.nextInt();

        System.out.print("Enter the Second Value = ");
        int num2 = input.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.printf("\nQuotient of %d and %d = %d", num1, num2, quotient);
        System.out.printf("\nRemainder of %d and %d = %d", num1, num2, remainder);
    }
}