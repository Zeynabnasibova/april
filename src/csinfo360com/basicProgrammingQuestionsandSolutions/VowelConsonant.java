package csinfo360com.basicProgrammingQuestionsandSolutions;
import java.util.Scanner;
public class VowelConsonant {
    /*
    Check whether an alphabet is vowel or consonant
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char ch = input.next().charAt(0);
        alphabet(ch);
    }
    public static void alphabet(char ch ){
        if(ch == 'a' || ch == 'e' || ch =='o' || ch == 'y' || ch == 'u' ){
            System.out.println("is vowe");
        }else{
            System.out.println("consonant");
        }
    }
    public static void alphabetSwitch(char ch){
        switch(ch){
            case'A':
            case 'a':
            case'O':
            case'o':
            case'E':
            case'e':
            case'U':
            case'u':
            case'Y':
            case'y':
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("It is consonant");
        }
    }
}
