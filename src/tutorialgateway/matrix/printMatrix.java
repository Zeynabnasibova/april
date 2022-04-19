package tutorialgateway.matrix;

public class printMatrix {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your row size");
//        int rowSize = input.nextInt();
//        System.out.println("Enter your column size");
//        int columnSize = input.nextInt();
//        int [] [] arr = new int [rowSize] [columnSize];
//        System.out.println(Arrays.deepToString(arr));
//     for(int i = 0; i < rowSize; i++){
//         for(int j = 0; j < columnSize; j++ ){
//             System.out.println("Enter row " + (i + 1)+ " column number " +(j+1));
//             arr[i][j]  = input.nextInt();
//         }
//     }
//        System.out.println(Arrays.deepToString(arr));


        int[][] arr2d = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        System.out.println("----Matrix items-----");
        for(int i = 0; i < arr2d.length;i++ ){
            for(int j =0; j < arr2d.length; j++){

                System.out.println("Matrix item at " + i + "," + j + " position = " + arr2d[i][j] );

            }
        }

    }
}
