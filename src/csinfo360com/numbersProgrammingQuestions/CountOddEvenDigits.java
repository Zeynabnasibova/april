package csinfo360com.numbersProgrammingQuestions;
import java.util.Scanner;
public class CountOddEvenDigits {
/*
Problem statement:- Program to Find the number of odd and even digits in the given number.
Sample Input/Output:-

Sample Input First: 879413                  Sample Output First: 2  4

Sample Input Second: 547863             Sample Output Second: 3  3
 */

public static void main(String [] args){
  Scanner input = new Scanner(System.in);
    System.out.println("Enter your number");
    int number = input.nextInt();
    countOddEven(number);

}
public static void countOddEven(int num ){

    int countEven = 0;
    int countOdd = 0;

    while (num != 0){
        int remainder = num % 10;
        if(remainder % 2 == 0){
            countEven++;
        }else{
            countOdd++;
        }
        num = num / 10;
    }
    System.out.println("Number of even number is " + countEven);
    System.out.println("Number of odd number is " + countOdd);
}


}
