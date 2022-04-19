package tutorialgateway.stringProgram;
import java.util.Scanner;
public class ReverseProgramusingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        ReverseProgramusingRecursion obj = new ReverseProgramusingRecursion();
        System.out.println(obj.reverse(word));
    }




    public String reverse(String word){
   String reversed = "";
        for(int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        return reversed;
    }

}
