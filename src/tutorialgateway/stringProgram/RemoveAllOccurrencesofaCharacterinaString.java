package tutorialgateway.stringProgram;

public class RemoveAllOccurrencesofaCharacterinaString {
    public static void main(String[] args) {
        System.out.println(removeChar("Zeynab Nasibova",'a'));
    }
    public static String removeChar(String word, char ch ){
        // ZEYNAB Nasibova
        String removed = "";
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != ch){
           removed = removed + word.charAt(i);
            }
        }
        return removed;
    }

}
