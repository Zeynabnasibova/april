package tutorialgateway.matrix;

public class CheckTwoMatricesareEqual {
    public static void main(String[] args) {
        int[][] x = {{15, 25, 35}, {45, 55, 65}, {75, 85, 95}};
        int[][] y = {{ 2, 4, 5}, {6, 8, 5}, {10, 15, 20}};
        //Calculates the number of rows and columns present in the first matrix

      int  row1 = x.length;
      int  col1 = x[0].length;
      boolean flag = true;

        //Calculates the number of rows and columns present in the second matrix

       int row2 = y.length;
       int col2 = y[0].length;

        //Checks if dimensions of both the matrices are equal
        if(row1 != row2 || col1 != col2){
            System.out.println("Matrices are not equal");
        }
        else {
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col1; j++){
                    if(x[i][j] != y[i][j]){
                        flag = false;
                        break;
                    }
                }
            }

            if(flag)
                System.out.println("Matrices are equal");
            else
                System.out.println("Matrices are not equal");
        }
    }
}