package tutorialgateway.characters;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your character");
        char ch = input.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch =='o' || ch =='y'){
            System.out.println(ch +" + is vowel");
        }else{
            System.out.println(ch + " is Consonant");
        }
    }
}
