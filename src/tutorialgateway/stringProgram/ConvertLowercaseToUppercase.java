package tutorialgateway.stringProgram;

import java.util.Scanner;

public class ConvertLowercaseToUppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String str = input.nextLine().toUpperCase();
        System.out.println(str);
    }
}
