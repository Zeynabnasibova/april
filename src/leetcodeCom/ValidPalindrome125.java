package leetcodeCom;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        String s = "0P";
        if (s == null || s.equals("")){
            System.out.println("Palindrome");;
        }
        s = s.toLowerCase();
        String newS = "";
        for(int i =0 ; i < s.length();i++){

            if(Character.isLetter(s.charAt(i))){
                newS += s.charAt(i);
            }
        }
        System.out.println(newS);
 String reverse = "";
        for(int i = newS.length() -1; i >= 0; i--){
            reverse += newS.charAt(i);
        }
        System.out.println(reverse);

        if(newS.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}