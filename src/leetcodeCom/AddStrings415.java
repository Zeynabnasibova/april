package leetcodeCom;

public class AddStrings415 {

    public static void main(String[] args) {
        System.out.println(addStrings("3876620623801494171",
                "6529364523802684779"));

    }
    public static String addStrings(String num1, String num2) {

       long strNum1 =Long.parseLong(num1);
        long strNum2 = Long.parseLong(num2);

      long sum = strNum1 + strNum2;

        String strSum = Long.toString(sum);
        return strSum;
    }
}