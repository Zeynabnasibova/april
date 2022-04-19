package tutorialgateway.arrayProgramm;
import java.util.Arrays;
public class SwapTwoArrayswithouttemp {

    public static void main(String[] args) {
        int [] a = new int [] {1,2,3,4,5};
        int [] b = new int [] {6,7,8,9,10};

        for(int i = 0; i < a.length; i++){
            a[i] = a[i] + b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
