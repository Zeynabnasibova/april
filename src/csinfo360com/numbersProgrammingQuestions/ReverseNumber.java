package csinfo360com.numbersProgrammingQuestions;
import java.util.Scanner;
public class ReverseNumber {
    /*
    Program to Find the reverse of a given number
Problem statement:- Program to Find the reverse of a given number.

Sample Input/Output:-

Sample Input First: 564646                      Sample Output First: 646465
Sample Input Second: 7894664               Sample Output Second: 4664987

     */
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        System.out.println(reverse(num));
    }
    public static int reverse(int number){

        int reverse =0;
        while (number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

}
