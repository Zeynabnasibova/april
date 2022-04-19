package tutorialgateway.matrix;

import java.util.Arrays;

public class performArithmeticoperationsonMatrix {
    public static void main(String[] args) {

        int[][] x = {{15, 25, 35}, {45, 55, 65}, {75, 85, 95}};
        int[][] y = {{ 2, 4, 5}, {6, 8, 5}, {10, 15, 20}};

        int rowFirstMatrix = x.length;
        int columnFirstMatrix = x[0].length;

        int rowSecondMatrix = y.length;
        int columnSecondMatrix = y[0].length;

        int [] [] add = new int [3][3];

        int [] [] sub = new int [3][3];

        int [] [] mul = new int [3][3];

        int [] [] div = new int [3][3];

        int [] [] mod = new int [3][3];

        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < y.length; j++){
                add[i][j] = x[i][j] + y[i][j];

                sub[i][j] = x[i][j] - y[i][j];

                mul[i][j] = x[i][j] * y[i][j];

                div[i][j] = x[i][j] / y[i][j];

                mod[i][j] = x[i][j] % y[i][j];

            }
        }
        System.out.println(Arrays.deepToString(add));

        System.out.println(Arrays.deepToString(sub));

        System.out.println(Arrays.deepToString(mul));

        System.out.println(Arrays.deepToString(div));

        System.out.println(Arrays.deepToString(mod));


    }
}
