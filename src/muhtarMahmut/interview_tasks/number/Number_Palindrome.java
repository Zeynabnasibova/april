package muhtarMahmut.interview_tasks.number;

public class Number_Palindrome {
        public static int reverse( int number) {
            if (number < 10 && number >= 0) {
                return number;
            } else {

                int reverse = 0;
                while (number != 0) {
                    int remainder = number % 10;
                    reverse = reverse * 10 + remainder;
                    number = number / 10;
                }
                return reverse;
            }
        }

        public static boolean isPalindrome(int number){
            int temp = number;
            if(reverse(number) == temp){
                return true;
            }else{
                return false;
            }

        }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    }