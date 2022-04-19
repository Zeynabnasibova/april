package tutorialgateway.stringProgram;

public class StringPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("javasj"));
    }
    public static String reverse(String word){

        String reverse = "";
        for(int i = word.length()-1; i >= 0;i--){
            reverse += word.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String word){

        if(word.equals(reverse(word))){
            return true;
        }else{
            return false;
        }
        }
    }

