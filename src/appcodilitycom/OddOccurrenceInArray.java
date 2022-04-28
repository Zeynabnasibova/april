package appcodilitycom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OddOccurrenceInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        System.out.println("Array A = " + Arrays.toString(A));
        int n = A.length;
        int unpairedElement;
        Set <Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            } else {
                set.add(A[i]);
            }
        }
        unpairedElement = set.iterator().next();

        System.out.println("Unpaired element: " + unpairedElement);
        return unpairedElement;


    }

}