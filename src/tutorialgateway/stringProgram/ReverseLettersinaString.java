package tutorialgateway.stringProgram;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class ReverseLettersinaString {
    public static void main(String[] args) {

        String word = "Zeynab Nasibova";
        String [] wordArr = word.split(" ");
        for(int i = 0; i < wordArr.length; i++){
            System.out.print(reverse(wordArr[i] + " "));

        }


    }

    public static String reverse(String str ){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
