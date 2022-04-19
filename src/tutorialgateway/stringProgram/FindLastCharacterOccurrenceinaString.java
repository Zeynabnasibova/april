package tutorialgateway.stringProgram;

import java.util.Scanner;

public class FindLastCharacterOccurrenceinaString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String str =  input.nextLine();
        System.out.println("Enter your letter");
        char ch =input.next().charAt(0);
        int countLetter = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == ch){
                countLetter++;//3
            }
        }
        int countSameLetter =0;
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i)==ch){
                countSameLetter++;
                if(countLetter == countSameLetter){
                    System.out.println("Letter " + ch + " last  time occurence at possition " + i);
                }
            }
        }

    }
}
