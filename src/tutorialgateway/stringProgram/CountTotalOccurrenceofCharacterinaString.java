package tutorialgateway.stringProgram;
import java.util.Scanner;

public class CountTotalOccurrenceofCharacterinaString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String str =  input.nextLine();
        System.out.println("Enter your letter");
        char  ch = input.next().charAt(0);

     int countGivenLetter =0;
        for(int i = 0; i < str.length();i++) {
            if(str.charAt(i) == ch){
                countGivenLetter++;
            }
        }
        System.out.println("the letter " + ch + "  occurrence in the String " + countGivenLetter + " times");
    }
}
