package tutorialgateway.stringProgram;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelsandConsonantsinaString {
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.println("Enter your sentence " );
            String str = input.nextLine().toLowerCase(Locale.ROOT);
            int countVowel = 0;
            int countConsonant =0;
            for(int i =0; i < str.length();i++){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'o' || str.charAt(i) == 'i'){
                    countVowel++;
                }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    countConsonant++;
                }
            }
        System.out.println(countVowel);
        System.out.println(countConsonant);

    }
}
