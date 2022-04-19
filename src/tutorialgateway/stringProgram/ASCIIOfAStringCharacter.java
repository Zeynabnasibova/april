package tutorialgateway.stringProgram;

import java.util.Scanner;

public class ASCIIOfAStringCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();
        for(int i = 0; i < str.length(); i++){
            int asciiValue = str.charAt(i);
//            System.out.println("ASCII value of " + str.charAt(i) + " = " + asciiValue);
//            System.out.println();
            System.out.println("ASCII value of " + str.charAt(i) + " = " + (int)str.charAt(i));
        }
    }
}
