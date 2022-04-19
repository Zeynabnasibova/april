package tutorialgateway.stringProgram;

import java.util.Scanner;

public class CharactersInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();

        for(int i = 0; i < str.length(); i++){

            System.out.println("Character at the possition "+ i + " = " + str.charAt(i));

        }

    }
}
