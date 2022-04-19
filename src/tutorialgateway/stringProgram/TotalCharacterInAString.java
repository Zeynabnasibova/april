package tutorialgateway.stringProgram;

import java.util.Scanner;

public class TotalCharacterInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();
        int countCharacter =0;
//        int totalCharacter = str.length();
//        System.out.println(totalCharacter);
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) != ' '){
                countCharacter++;
            }
        }
        System.out.println(countCharacter);
        }
    }
