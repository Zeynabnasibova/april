package csinfo360com.basicProgrammingQuestionsandSolutions;
import java.util.Scanner;
public class AdditionMultiplicationAverage {
    /*
    Find sum multiplication and an average of two numbers
     */
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("enter your second number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int mult = num1 * num2;
    double average = sum/2;
        System.out.println("Adition of two numbers " + num1 + " +  " + num2 + " = " + sum );
        System.out.println("Multiplication of two numbers " + num1 + " *  " + num2 + " = " + mult );
        System.out.println("Average of two numbers (" + num1 + " +  " + num2 + ")/" + 2+ " = " + average );
    }
}
