package tutorialgateway.stringProgram;

public class RemoveFirstCharacterOccurrenceinaString1 {

    public static void main(String[] args) {
        String word = "Zeynab Nasibova";
        char occurrience = 'a';

        int count = 0;
        for(int i = 0; i <  word.length(); i++){
            if(word.charAt(i) == occurrience){
                count++;
                if(count == 1){
                    word = word.replaceFirst(""+occurrience,"");

                }

            }

        }
        System.out.println(word);

    }

}
