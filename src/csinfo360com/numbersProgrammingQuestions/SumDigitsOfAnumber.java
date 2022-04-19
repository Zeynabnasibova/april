package csinfo360com.numbersProgrammingQuestions;
import java.util.Scanner;
public class SumDigitsOfAnumber {
    /*
    Write a program to sum of all digits of a number.
     */
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        System.out.println(sum(number));

    }
    public static int sum(int num){
        int sum = 0;
        while (num != 0){
            int remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        return sum;
    }


}
