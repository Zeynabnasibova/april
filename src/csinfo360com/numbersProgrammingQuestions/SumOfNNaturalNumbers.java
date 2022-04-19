package csinfo360com.numbersProgrammingQuestions;
import java.util.Scanner;
public class SumOfNNaturalNumbers {
    /*
    Program to Find sum of N Natural Numbers
Natural Number:- Counting Numbers are known as Natural numbers.

Example:-

 1, 2, 3, 4, 5, 6.......N.

Problem statement:- Program to find the sum of N natural numbers.

Sample Input/Output:-

Sample Input First: 25                         Sample Output First: 325
Sample Input Second: 23                    Sample Output Second: 276
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        System.out.println(sum(number));

    }
    public static int sum(int num ){
        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum = sum + i;
        }
        return sum;
    }
}
