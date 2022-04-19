package csinfo360com.numbersProgrammingQuestions;
import java.util.Scanner;
public class CountNumberOfDigits {
    /*
    Program to count the number of digits in an integer.

Enter a number:79546
The number of digits in the number is 5
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        System.out.println(countNumber(num));
    }
    public static int countNumber(int num){
        int count = 0;
        while(num != 0 ){
            int remainder = num % 10;
            num = num / 10;
            count++;
        }
        return count;
    }

}
