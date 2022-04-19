package csinfo360com.seriesProgramming;

import java.util.Scanner;

public class SumOfSeries1kub2kubNkum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter range of number");
        int rowSize = input.nextInt();
        System.out.println(sumOfCubes(rowSize));

    }
    public static int sumOfCubes(int range){
        int sumOfcub =0;
        for(int i = 1 ; i <= range ;i++){
           sumOfcub += Math.pow(i,3);

        }
        return sumOfcub;

    }

// 1 + 8
}
