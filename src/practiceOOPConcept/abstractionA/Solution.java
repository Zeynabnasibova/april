package practiceOOPConcept.abstractionA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
String s = "Test1ng-Leet=code-Q!";
String reversedLetter = "";
//Output: "Qedo1ct-eeLg=ntse-T!"

        char [] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));

        int right =ch.length -1 ;
        int left = 0;
        while(right > left){
            if(!Character.isAlphabetic(ch[left])){
                left++;
            }else if(!Character.isAlphabetic(ch[right])){
               right --;

            }else{
                char tmp = ch[left];
                ch[left] = ch[right];
                ch[right]= tmp;
                left++;
                 right--;
            }
        }
        System.out.println(Arrays.toString(ch));
    }

}