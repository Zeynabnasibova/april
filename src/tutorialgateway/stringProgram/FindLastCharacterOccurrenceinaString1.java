package tutorialgateway.stringProgram;

public class FindLastCharacterOccurrenceinaString1 {
    public static void main(String[] args) {
        String word = "Zeynab Nasibova";
        char occurrence = 'a';

        int position = 0;
        for(int i = 0; i < word.length();i++){
            if(word.charAt(i) == occurrence){
                position = i;//14

            }
        }
        System.out.println("The Last Character Occurrence of " + occurrence + "at position " + position);

    }
}
