package csinfo360com.seriesProgramming;

import java.util.Scanner;

public class SumOfSeries123N {
    /*
    Program to find the sum of series 1+2+3..+N

Enter the range of number:8
The sum of the series = 36
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter range of number");
        int rowSize = input.nextInt();
        System.out.println(sumOfSeries(rowSize));

    }
    public static int sumOfSeries(int range){
        int sumOfSeries =0;
        for(int i = 1 ; i <= range ;i++){
            sumOfSeries += i;
        }
        return sumOfSeries;

    }

}
