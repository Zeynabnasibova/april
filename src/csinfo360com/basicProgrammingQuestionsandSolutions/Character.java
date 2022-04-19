package csinfo360com.basicProgrammingQuestionsandSolutions;
import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character");
        char ch= input.next().charAt(0);
        character(ch);
    }
    public static void character(char ch){
        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is lowercase");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch + " is UpperCase");
        }else if(ch >= '0' && ch <= '9'){
            System.out.println(ch + " is number");
        }else{
            System.out.println("it is a special character");
        }
    }
}
