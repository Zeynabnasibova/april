package tutorialgateway.stringProgram;

import java.util.Scanner;

public class FindFirstCharacterOccurrenceinaString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String str =  input.nextLine();
        System.out.println("Enter your letter");
        char ch =input.next().charAt(0);
       int countLetter = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == ch){
                countLetter++;
                if(countLetter == 1){
                    System.out.println("letter " + ch + " first time occurce at possition " + i);
                }

            }
        }
    }
}
