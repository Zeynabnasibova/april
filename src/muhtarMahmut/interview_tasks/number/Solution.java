package muhtarMahmut.interview_tasks.number;

class Solution {

    public static void main(String[] args) {

    }

    public class Challenge {
        public static int calculator(int num1, char operator, int num2) {
            if (operator == '+') {
                return num1 + num2;
            }if (operator == '*') {
                return num1 * num2;
            }       if (operator == '/') {
                        return num1 / num2;
            } else {
                return 0;
            }
        }
    }
}