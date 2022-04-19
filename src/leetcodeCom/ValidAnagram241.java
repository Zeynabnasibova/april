package leetcodeCom;

import java.util.Arrays;

public class ValidAnagram241 {
    public boolean isAnagram(String s, String t) {

        if(s.length() < t.length() || t.length() < s.length()){
            return false;

        }
        String [] strS = s.split("");
        String [] strT = t.split("");

        //or
//        char [] chS = s.toCharArray();
//        char [] chT = t.toCharArray();

        Arrays.sort(strS);
        Arrays.sort(strT);

        if(Arrays.equals(strS, strT)){
            return true;
        }else{
            return false;
        }


    }
}
//anagram
//nagaram