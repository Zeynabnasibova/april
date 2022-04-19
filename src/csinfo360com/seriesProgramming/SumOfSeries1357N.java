package csinfo360com.seriesProgramming;

import java.util.Scanner;

public class SumOfSeries1357N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter range of number");
        int rowSize = input.nextInt();
        System.out.println(sumOfSeries(rowSize));

    }
    public static int sumOfSeries(int range){
        int sumOfSeries =0;
        for(int i = 1 ; i <= range ;i += 2){
            sumOfSeries += i;
        }
        return sumOfSeries;

    }

}
