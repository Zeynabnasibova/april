package appcodilitycom;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Set<Integer> pr = new HashSet<Integer>(Arrays.asList(1,2,3,1,2));
        System.out.println(pr);

        int num = 1;
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1,num);
        System.out.println(set1);
    }
}
