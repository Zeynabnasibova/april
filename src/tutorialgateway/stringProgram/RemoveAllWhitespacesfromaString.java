package tutorialgateway.stringProgram;

public class RemoveAllWhitespacesfromaString {
    public static void main(String[] args) {
        String word = "Zeynab Nasibova Camal qizi";
 word = word.replaceAll(" ","");
        System.out.println(word);
    }
}
