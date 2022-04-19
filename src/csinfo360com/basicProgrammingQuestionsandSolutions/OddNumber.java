package csinfo360com.basicProgrammingQuestionsandSolutions;

public class OddNumber {
    public static void main(String[] args) {
        int n = 100;
        for(int i = 1 ; i <= 100; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
