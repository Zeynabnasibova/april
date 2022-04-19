package tutorialgateway.stringProgram;

public class P {
    public static void main(String[] args) {
        String str = "Zeynab Nasibova";
        String [] strArr = str.split("");
        String reverse = "";

        for(int i = strArr.length-1; i >= 0; i--){
            reverse += strArr[i];

        }
        System.out.println(reverse);
    }
}
