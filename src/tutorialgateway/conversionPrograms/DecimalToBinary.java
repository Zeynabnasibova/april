package tutorialgateway.conversionPrograms;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your decimal number");
        int decimal = input.nextInt();
        decimalToBinary(decimal);
    }

    public static void decimalToBinary(int decimal){//78
        int binary = 0;
        int temp = 1;
        while(decimal != 0){
            int remainder = decimal % 2;
            decimal = decimal / 2;
            binary = binary + remainder * temp;
            temp = temp * 10;
        }
        System.out.println("The Binary Number is: "+ binary);

    }
}
