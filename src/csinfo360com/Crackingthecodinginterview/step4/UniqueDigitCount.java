package csinfo360com.Crackingthecodinginterview.step4;

import java.util.ArrayList;

public class UniqueDigitCount {
    public static void main(String[] args) {
        int num = 292;

        ArrayList<Integer> list = new ArrayList<>();

        while (num != 0){
            int remainder = num % 10;
            list.add(remainder);
            num = num / 10;
        }
        System.out.println(list);
        ArrayList <Integer> newList = new  ArrayList<>();
        for(int i = 0; i < list.size();i++){//2 9 2
           if(!newList.contains(list.get(i))){
               newList.add(list.get(i));
           }
        }
        System.out.println(newList);
        int uniqueDigit = newList.size();
        System.out.println(uniqueDigit);
    }
}
