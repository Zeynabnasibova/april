package tutorialgateway.stringProgram;

import java.util.Scanner;

public class FindAllOccurrencesofaCharacterinaString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String str =  input.nextLine();
        System.out.println("Enter your letter");
        char  ch = input.next().charAt(0);

        for(int i = 0; i < str.length();i++) {
            if(str.charAt(i) == ch){
                System.out.println(ch + " found at possition "+ i);
            }
        }

    }
}
