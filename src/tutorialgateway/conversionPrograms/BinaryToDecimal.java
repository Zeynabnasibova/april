package tutorialgateway.conversionPrograms;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your binary number");
        int number = input.nextInt();
        System.out.println(binaryToDecimal(number));
    }

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int temp = 0;
        while (binary != 0) {
            int reminder = binary % 10;
            binary = binary / 10;
            decimal = (int) (decimal + (reminder * Math.pow(2, temp)));
            temp++;
        }
        return decimal;

    }
}