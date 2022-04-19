package tutorialgateway.stringProgram;

public class FindAllOccurrencesofaCharacterinaString1 {
    public static void main(String[] args) {
        String word = "Zeynab Nasibova";
        char occurrence = 'a';

        for(int i = 0; i< word.length(); i++){
            if(word.charAt(i) == occurrence){

                System.out.println("possition at index " + i  + " is " + occurrence);
            }
        }

    }
}
