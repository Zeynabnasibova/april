package tutorialgateway.conversionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArraysTo {
    public static void main(String[] args) {

        //String [] --> String
        String [] strArr = new String [] {"Zeynab", "Zeynab"};
        String str1 = String.join(" ",strArr);
        System.out.println(str1);

        //String [] --> List
        List<String> list1 = new ArrayList<String>(Arrays.asList(strArr));
        List<String> list2 = Arrays.asList(strArr);

        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(strArr));

        ArrayList <String> list4 = new ArrayList<>(List.of(strArr));
       List <String> list5 = List.of(strArr);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

    }
}
