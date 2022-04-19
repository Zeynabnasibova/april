package tutorialgateway.stringProgram;

import java.util.HexFormat;

public class ToggleAllCharactersinaString {
    public static void main(String[] args) {
        String word = "Hello Guys!";
String newWord = "";
        for(int i = 0; i< word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                newWord = newWord + Character.toLowerCase(word.charAt(i));
            }else if(Character.isLowerCase(word.charAt(i))){
                newWord = newWord + Character.toUpperCase(word.charAt(i));
            }else{
                newWord = newWord +  word.charAt(i);
            }
        }
        System.out.println(newWord);
    }
}
