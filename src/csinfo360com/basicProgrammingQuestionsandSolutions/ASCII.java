package csinfo360com.basicProgrammingQuestionsandSolutions;
import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your value");
        char ch = input.next().charAt(0);
        int asciiOfCh = ch;
        System.out.println(asciiOfCh);
    }
}
