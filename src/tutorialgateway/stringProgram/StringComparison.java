package tutorialgateway.stringProgram;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Tutorial Gateway";
        String str2 = "Tutorial Gateway";
        String str3 = new String("Java Programming");
        String str4 = new String("Java Programming");
        String str5 = new String("Tutorial Gateway");
        String str6 = null;
        System.out.println(str1.equals(str2));//true +
        System.out.println(str3.equals(str4));//true+
        System.out.println(str1.equals(str5));//true
        System.out.println(str1 == str2);// true-
        System.out.println(str3 == str4);//false
        System.out.println(str1 == str5);//false
       // System.out.println(str6.equals(null));//false

    }
}