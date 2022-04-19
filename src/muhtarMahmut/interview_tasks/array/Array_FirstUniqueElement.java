package muhtarMahmut.interview_tasks.array;

import java.util.ArrayList;

public class Array_FirstUniqueElement {
    /*
 write a program that can find the first unique element from the array
  */
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 3, 3, 4, 4,1};
        int duplicatedElement = 0;
        ArrayList<Integer> list = new ArrayList <>();//1,2,3,4
        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(""+arr[i])){
                list.add(arr[i]);
            }
        }
        ArrayList <Integer> uniqueList = new ArrayList<>();

        for(int i = 0; i < list.size();i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (list.get(i) == arr[j]) {
                    count++;
                }
            }
            if(count == 1){
                uniqueList.add(list.get(i));
            }
        }
        System.out.println(uniqueList);

        int firstUnique =0;
        System.out.println(uniqueList.get(0));

    }
}