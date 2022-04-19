package tutorialgateway.numbers;

import java.util.Scanner;

public class SumOfNaturalNumbersFrom1ToN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
         for(int i = 0; i <= num; i++){
       sum = sum + i;
         }
        System.out.println(sum);
    }
}
