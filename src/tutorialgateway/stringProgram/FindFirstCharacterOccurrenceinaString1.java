package tutorialgateway.stringProgram;

public class FindFirstCharacterOccurrenceinaString1 {
    public static void main(String[] args) {
        String word = "Zeynab Nasibova";
        char  occurrence = 'a';
        int count = 0;
        int possition = 0;
        for(int i =0 ; i < word.length(); i++){
            if(word.charAt(i) == occurrence){
                count++;
                if(count == 1){
                    possition = i;//possition = 4
                }
            }
        }
        System.out.println("The firs character " + occurrence + " occurrence in a String at possition " + possition);
    }
}
