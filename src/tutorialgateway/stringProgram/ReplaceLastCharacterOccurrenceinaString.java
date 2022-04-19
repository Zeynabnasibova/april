package tutorialgateway.stringProgram;

public class ReplaceLastCharacterOccurrenceinaString {
    public static void main(String[] args) {
        String word = "Zeynab Nasib";
        char occurrence = 'a';
char newOc = 'e';
String newWord = "";
        int count = 0;
        int possition =0;
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == occurrence){
                count++;
                possition = i;

            }
        }
        System.out.println(possition);
        System.out.println(word.charAt(possition));
//       // System.out.println(word.substring(0,1).replace(occurrence, newOc) + word.substring(1));
        System.out.println(word.substring(0,possition));
        System.out.println(word.substring(0,possition) + word.substring(possition,possition+1).replace(occurrence,newOc) +  word.substring(possition+1));

    }



}

