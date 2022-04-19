package tutorialgateway.stringProgram;

public class FirstAndLastCharacterInaString {

    public static void main(String[] args) {
        String word = "Zeynab";
        System.out.println(firstCharacter(word));
        System.out.println(lastCharacter(word));
    }
    public static String firstCharacter(String word){
        String firstChar = ""+ word.charAt(0);
        return firstChar;
    }
    public static String lastCharacter(String word){
        String lastCharacter = ""+ word.charAt(word.length()-1);
        return lastCharacter;
    }

}
