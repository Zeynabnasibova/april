package tutorialgateway.stringProgram;

import java.util.Arrays;

public class eplaceLastCharacterOccurrenceinaString2 {
    public static void main(String[] args) {
       String str = "Zeynab Nasib";
            int count = 0;
            int possition =0;
            char chReplace = 'a';
            char newOne = 'e';
            String newStr = "";
         char [] strArr = str.toCharArray();
            for(int i =0; i < strArr.length;i++){
                if(strArr[i]==chReplace){
                    count++;
                    possition=i;

                }
            }
        System.out.println(possition);
        System.out.println(chReplace);
        strArr[possition]=newOne;
        System.out.println(Arrays.toString(strArr));
            for(int i = 0; i< strArr.length;i++){
                newStr += strArr[i];


        }
    }
}