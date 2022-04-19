package csinfo360com.conversionProgrammingQuestionsAndSolutions;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
    /*
    Program to convert binary to decimal using while loop

Enter Binary number:
1011110
Decimal number is: 94
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your binary number");
        int number = input.nextInt();
        System.out.println(binaryToDecimal(number));
    }
    public static int binaryToDecimal(int binary){
        int decimal= 0;
        int temp = 0;
        while (binary!=0) {
         int   reminder = binary % 10;
            binary = binary / 10;
            decimal = (int) (decimal + (reminder*Math.pow(2,temp)));
            temp++;
        }
        return decimal;

    }
}
