package tutorialgateway.stringProgram;

import java.util.Scanner;

public class FrequencyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();

        String letter = "";
        for(int i = 0; i < str.length();i++){
                if(!letter.contains("" + str.charAt(i))){
                    letter +=   str.charAt(i);
            }
        }
        System.out.println(letter);

String frequensy = "";
for(int i = 0; i < letter.length(); i++){
    int count = 0;
    for(int j = 0; j < str.length(); j++){
        if(letter.charAt(i) == str.charAt(j)){
            count++;
        }
    }
    frequensy += letter.charAt(i) + "" + count;
}
        System.out.println(frequensy);

    }

}
