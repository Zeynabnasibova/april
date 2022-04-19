package tutorialgateway.stringProgram;

import java.util.Arrays;
public class RemoveLastCharacterOccurrenceinaString {
    public static void main(String[] args) {
        String word = "Zeynab Nasib";
        char occurence = 'a';
String [] wordArr = word.split("");
        int count = 0;
        int position = 0;

        for(int i = 0; i < wordArr.length; i++) {
            if (wordArr[i].equals( ""+occurence)) {
                count++;
                position = i;
            }
        }
        wordArr[position] = "";
        System.out.println(Arrays.toString(wordArr));
//
//        String newWord = String.join("",wordArr);
//        System.out.println(newWord);
        String newWord = "";
        for(int i = 0; i < wordArr.length; i++){
           newWord += wordArr[i];
        }
        System.out.println(newWord);
    }
}
