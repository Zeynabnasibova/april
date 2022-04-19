package csinfo360com.basicProgrammingQuestionsandSolutions;
import java.util.Scanner;
public class POsNegativ {
    /*
    Check whether a given number is positive or negative
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        if(num < 0){
            System.out.println("negativ number");
        }else if (num > 0){
            System.out.println("Positive number");
        }else{
            System.out.println("Number is 0");
        }
    }
}
