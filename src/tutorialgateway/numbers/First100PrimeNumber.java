package tutorialgateway.numbers;

import java.util.Scanner;

public class First100PrimeNumber {

    public static void main(String[] args) {
  int count = 0;
        for(int i = 1; i <= count ; i--){
            if(isPrime(i)){
                System.out.print(i + " ");
                count++;
             if(count == 100){
                 break;

             }
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
