package tutorialgateway.numbers;

import java.util.Scanner;

public class PrimeNumberFrom1toN {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      //  System.out.println(isPrime(4));
        System.out.println("Enter your number");
        int num = input.nextInt();

        for(int i = 1; i <= num ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }


    }
    public static boolean isPrime(int num){
        int count = 0;
        if(num <= 1) {
            return false;
        }else{

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
