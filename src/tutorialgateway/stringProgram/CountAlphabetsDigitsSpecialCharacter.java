package tutorialgateway.stringProgram;

import java.util.Scanner;

public class CountAlphabetsDigitsSpecialCharacter {
    public static void main(String[] args) {

            Scanner input = new Scanner (System.in);
            System.out.println("Enter your sentence " );
            String str = input.nextLine();
            int countDigit = 0;
        int countLetter= 0;
        int specialCharacter = 0;
        for(int i = 0; i < str.length(); i++){
                if(Character.isDigit(str.charAt(i))){
                    countDigit++;
                }else if(Character.isLetter(str.charAt(i))){
                    countLetter++;
                }else{
                    specialCharacter++;
                }
            }
        System.out.println(countDigit);
        System.out.println(specialCharacter);
        System.out.println(countLetter);
    }
}
