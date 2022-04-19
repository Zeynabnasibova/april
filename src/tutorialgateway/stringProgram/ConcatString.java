package tutorialgateway.stringProgram;

import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first wordb");
        String str1 = input.nextLine();
        System.out.println("Enter your next word");
        String str2 = input.nextLine();
        String concat = str1.concat(str2);
        System.out.println(concat);
    }
}
