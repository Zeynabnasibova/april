package leetcodeCom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ReverseVowelsofaString345 {



    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<Character>();
        Collections.addAll(vowels, 'a','e','i','o','u','A','E','I','O','U');
        int left = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            if (!vowels.contains(chars[left])) {
                left ++;
                continue;
            }
            if (!vowels.contains(chars[right])) {
                right --;
                continue;
            }
            char tmp = chars[left];
            chars[left ++] = chars[right];
            chars[right--] = tmp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels1("Zeynab"));
    }

    public static  String reverseVowels1(String s) {
        ArrayList<Character> vowels  = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int left = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            if (!vowels.contains(chars[left])) {
                left ++;
                continue;
            }
            if (!vowels.contains(chars[right])) {
                right --;
                continue;
            }
            char tmp = chars[left];
            chars[left ++] = chars[right];
            chars[right--] = tmp;
        }
        return new String(chars);
    }

}

