package tutorialgateway.characters;
import java.util.Scanner;
public class CheckCharacterAlphabetOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your character");
        char ch = input.next().charAt(0);
        if(ch >= 'A' && ch <='Z'|| ch >='a'&& ch <='z'){
            System.out.println("Character is Alphabet");
        }else{
            System.out.println("Character not Alphabet");
        }
    }
}
