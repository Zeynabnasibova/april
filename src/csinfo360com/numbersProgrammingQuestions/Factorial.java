package csinfo360com.numbersProgrammingQuestions;
import java.util.Scanner;
public class Factorial {
    /*
    Program to Find the factorial of a number
    Problem statement:- Program to Find the factorial of a number.

Sample Input/Output:-

Sample Input First: 5                      Sample Output First: 120
Sample Input Second: 7                 Sample Output Second: 5040

     */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        System.out.println(factorial(num));
    }
    public static int factorial(int num){
        int factorial = 1;
     for(int i = num; i > 0; i--){
         factorial = factorial * i;
     }
        return factorial;
    }

}
