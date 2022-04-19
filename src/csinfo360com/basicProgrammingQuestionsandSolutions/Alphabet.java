package csinfo360com.basicProgrammingQuestionsandSolutions;

public class Alphabet {
    /*
    Program to print all alphabets from A to Z using loop
     */
    public static void main(String[] args) {
//        for(char ch = 'A'; ch <= 'Z';ch++){
//            System.out.print(ch + " ");
//        }
        for (int i = 65; i <= 90 ; i++) {
            System.out.print((char)i + " ");
        }
    }
}
