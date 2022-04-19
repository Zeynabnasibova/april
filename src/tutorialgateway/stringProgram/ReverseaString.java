package tutorialgateway.stringProgram;

public class ReverseaString {
    public static void main(String[] args) {

        String word = "Zeynab Nasibova";
        StringBuilder reversed = new StringBuilder(word);
        System.out.println(reversed);
        reversed.reverse();
        System.out.println(reversed);

        StringBuffer reverse2 = new StringBuffer(reversed);
        reverse2.reverse();
        System.out.println(reverse2);

    }
}
