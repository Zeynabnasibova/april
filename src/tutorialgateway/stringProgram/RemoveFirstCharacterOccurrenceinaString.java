package tutorialgateway.stringProgram;

public class RemoveFirstCharacterOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println(removed("Zeynab Nasibova",'a'));
    }
    public static String removed(String word, char ch) {
        String removed = "";
        int count = 0;
        int possition = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                count++;
                if (count == 1) {
                    possition = i;
                }
            }
        }

            if (word.charAt(possition) == ch) {
                removed = word.replaceFirst(""+word.charAt(possition), "");
    }
        return removed;

    }

}
