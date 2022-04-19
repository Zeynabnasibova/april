package csinfo360com.numbersProgrammingQuestions;
import java.util.Scanner;
public class PrimeFactor {

    /*
    program to find the prime factors of a number
Problem statement:- Program to find the prime factors of a number.

Sample Input/Output:-

Sample Input First: 45                         Sample Output First: 3 3 5
Sample Input Second: 30                    Sample Output Second: 2 3 5

Explanation:-

For output 1st: 3*3*5=45

For output 2nd: 2*3*5=30
     */
    //30 -> 2 3 5 15 30
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        factor(num);
    }

public static void factor(int num ){
    int factor = 0;
        for(int i = 1; i <= num; i++){

        if(num % i == 0){
           if(isPrime(i)){
               System.out.println(i + " ");
           }
        }
        }


}


    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }else{
            int count = 0;
            for(int i = 2; i <= num; i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 1){
                return true;
            }else{
                return false;
            }
        }

    }

}