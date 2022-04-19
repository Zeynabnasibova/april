package tutorialgateway.stringProgram;

public class FindFrequencyofeachCharacterinaString1 {
    public static void main(String[] args) {
        String word = "AAAABBBBDDD";
        String letter = "";//ABD

        for(int i = 0; i< word.length(); i++){
            if(!letter.contains(""+word.charAt(i))){
                letter += word.charAt(i);
            }
        }



        String frequency = "";
        for(int i = 0; i < letter.length(); i++){
            int count = 0;//4
            for(int j = 0; j < word.length(); j++){
                if(letter.charAt(i) == word.charAt(j)){
                     count++;
                }
            }
            frequency += "" + letter.charAt(i) + count;
        }
        System.out.println(frequency);
    }
}
