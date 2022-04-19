package tutorialgateway.stringProgram;
import java.util.Arrays;
public class SortStringsinAlphabeticalOrder {
    public static void main(String[] args) {

        String word = "banan kiwi apple usa canada";
        String[] wordArr = word.split(" ");
     Arrays.sort(wordArr);
        System.out.println(Arrays.toString(wordArr));

    }
}
