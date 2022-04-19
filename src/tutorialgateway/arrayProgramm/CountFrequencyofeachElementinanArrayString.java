package tutorialgateway.arrayProgramm;

import java.util.Arrays;

public class CountFrequencyofeachElementinanArrayString {
    public static void main(String[] args) {
        String [] arr = new String [] {"A","B","C","A","A"};

        String str = String.join("",arr);
      //  System.out.println(str);

        String letter = "";
        for(int i = 0; i < str.length();i++){
            if(!letter.contains("" + str.charAt(i))){
                letter +=   str.charAt(i);
            }
        }
     //   System.out.println(letter);

        String frequensy = "";
        for(int i = 0; i < letter.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(letter.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            frequensy += letter.charAt(i) + "" + count;
        }
        System.out.println(frequensy);

    }

}