package csinfo360com.Crackingthecodinginterview.step4;

import java.util.ArrayList;

public class NonRepeatedDigitsCount {
    public static void main(String[] args) {
        int num = 2923479;

        ArrayList<Integer> list = new ArrayList<>();

        while (num != 0){
            int remainder = num % 10;
            list.add(remainder);
            num = num / 10;
        }
        System.out.println(list);
int countNonRepeted = 0;
        ArrayList <Integer> nonRepeated = new ArrayList<>();
        for(int i = 0; i < list.size();i++){//2 9 2 3 4 7 9
            int count = 0;
            for(int j = 0; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    count++;
                }
            }
            if(count == 1){
                countNonRepeted++;
               nonRepeated.add(list.get(i));
            }
            }
        System.out.println(nonRepeated);
        System.out.println(countNonRepeted);

    }
}
