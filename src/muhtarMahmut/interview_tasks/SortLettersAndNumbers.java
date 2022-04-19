package muhtarMahmut.interview_tasks;

import java.util.Arrays;

public class SortLettersAndNumbers {

    public static void main(String[] args) {

        String str = "DC501GCCCA098911";
        //  "CD015ACCCG011899"

        String str2 = "";

        for(int i = 0; i < str.length(); i++){
            str2 += str.charAt(i);
            if(Character.isDigit(str.charAt(i)) && i < str.length() -1){
                if(Character.isLetter(str.charAt(i + 1))){
                    str2 += ",";
                }
            }
            if(Character.isLetter(str.charAt(i)) && i < str.length() -1){
                if(Character.isDigit(str.charAt(i + 1))){
                    str2 += ",";
                }
            }
        }
        String [] strArr = str2.split(",");

        System.out.println(Arrays.toString(strArr));//[DC, 501, GCCCA, 098911]

        String sortedConteyner = "";
        for(int i = 0; i < strArr.length; i++){
            String [] forSort = strArr[i].split("");
            Arrays.sort(forSort);
            System.out.println(Arrays.toString(forSort));

            for(String eachI : forSort){
                sortedConteyner += "" + eachI;
            }
        }
        System.out.println(sortedConteyner);
    }
}