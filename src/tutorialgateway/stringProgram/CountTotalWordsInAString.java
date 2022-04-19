package tutorialgateway.stringProgram;

import java.util.Scanner;

public class CountTotalWordsInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your sentence " );
        String str = input.nextLine();

        String [] strArr = str.split(" ");
        int totalWords = strArr.length;
        System.out.println(totalWords);

    }
}
