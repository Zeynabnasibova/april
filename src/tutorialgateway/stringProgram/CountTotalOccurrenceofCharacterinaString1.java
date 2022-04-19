package tutorialgateway.stringProgram;

public class CountTotalOccurrenceofCharacterinaString1 {

    public static void main(String[] args) {

        String word = " Zeynab Nasibova";
        char occurrence = 'a';
int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == occurrence){
                count++;
            }
        }
        System.out.println(count);
    }
}
