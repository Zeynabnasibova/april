package muhtarMahmut.interview_tasks.array;

import java.util.ArrayList;

public class Array_FirstDuplicatedElement {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 3, 3, 4, 4,1};
        int duplicatedElement = 0;
        ArrayList<Integer> list = new ArrayList <>();//1,2,3,4
        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(""+arr[i])){
                list.add(arr[i]);
            }
        }
        ArrayList <Integer> duplicated = new ArrayList<>();

        for(int i = 0; i < list.size();i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (list.get(i) == arr[j]) {
                    count++;
                }
            }
            if(count > 1){
                duplicated.add(list.get(i));
            }
        }
        System.out.println(duplicated);

        System.out.println(duplicated.get(0));

    }
}