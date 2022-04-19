package tutorialgateway.arrayProgramm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversIntArrayUseList {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 9, 16, 25};
        System.out.println("Array before reverse : " + Arrays.toString(array));

        reverse(array);
        System.out.println("Array after reverse : " + Arrays.toString(array));
    }

    static void reverse(Integer[] array) {
        List <Integer>list = new ArrayList<>(Arrays.asList(array));

        for (int i = 0; i < list.size() - 1; i++) {
            list.add(i, list.remove(list.size() - 1));
        }

        for (int i = 0; i < list.size(); i++) {
            array[i] = (Integer) list.get(i);
        }
    }
}