package leetcodeCom;

public class LengthofLastWord58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {

        String [] strArr = s.split(" ");

        int lengthLastWord = strArr[strArr.length-1].length();

        return lengthLastWord;

    }
}
