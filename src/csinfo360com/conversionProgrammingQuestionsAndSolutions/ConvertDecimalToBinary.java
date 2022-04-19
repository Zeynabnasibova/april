package csinfo360com.conversionProgrammingQuestionsAndSolutions;
import java.util.Scanner;
public class ConvertDecimalToBinary {
    /*
    Program to convert a decimal number to Binary
    Enter a Decimal Number:
67
The Binary Number is: 1000011
     */
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
