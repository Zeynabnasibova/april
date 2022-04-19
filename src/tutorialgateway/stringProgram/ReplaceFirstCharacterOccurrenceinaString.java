package tutorialgateway.stringProgram;

public class ReplaceFirstCharacterOccurrenceinaString {
    public static void main(String[] args) {
        String word = "Zeynab Nasibova";
        char ch = 'a';
        char newCh = 'e';
        String replaced = "";
        int count = 0;
        int possition = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                count++;
                if (count == 1) {
                    possition = i;
                    replaced = word.replaceFirst("" + word.charAt(possition),  ""+newCh);
                }
            }
        }
        System.out.println(possition);
        System.out.println(replaced);
    }
    }
    //        if (word.charAt(possition) == ch) {
    //                removed = word.replaceFirst(""+word.charAt(possition), "");
    //    }

