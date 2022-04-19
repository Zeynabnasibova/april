package tutorialgateway.stringProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveFirstandLastCharacterinaString {
//    public static void main(String[] args) {
//        System.out.println(removed("Zeynab Nasibova",'a'));
//    }
  //  public static String removed(String word, char ch) {
public static void main(String[] args) {
    String word = "Zeynab Nasibova";
    char ch = 'a';


        String removed = "";
        int possition = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                possition = i;
            }
        }


        String [] wordArr = word.split("");
    ArrayList <String> list = new ArrayList<>(List.of(wordArr));
     list.remove(possition);
    System.out.println(list);
    for(int i = 0; i < list.size(); i++) {
        removed += list.get(i);
    }
    System.out.println(removed);

//    List<String> l = new ArrayList<>(Arrays.asList("Zenab","Nasibova"));
//    System.out.println(l);

    }

}
