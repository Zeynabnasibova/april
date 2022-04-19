package csinfo360com.numbersProgrammingQuestions;
public class Prime {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(palindrome(num));
    }
    public static boolean palindrome(int num){

        if (num <= 1){
            return false;

        }else{
            int count =0;
            for(int i = 2; i<= num; i++){
                if(num% i == 0){
                    count ++;
                }
            }
            if (count == 1){
                return true;
            }else{
                return false;
            }
        }
    }
}
