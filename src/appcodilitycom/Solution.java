package appcodilitycom;

class Solution {
    public static void main(String args[]){
        int[] arr  =  {1,5,6,9,28,30};
        System.out.println(findMinCost(arr));
    }
    public static int findMinCost(int[] arr) {
        int[][] dp = new int[arr.length][3];
        int[] tDays = {1,7,30};
        int[] tCost = {2,7,25};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==0){
                    dp[i][j]= (i+1)*tCost[j];
                }
                else{
                    int c = arr[i]-tDays[j];
                    int tempCost = tCost[j];
                    int k;
                    if (c>=arr[0] && i>0){
                        for (k = i-1; k >= 0; k--) {
                            if (arr[k]<=c){
                                c = arr[k];
                            }
                        }
                        tempCost += dp[c][j];
                        int tempCostX =  dp[i-1][j] + tCost[0];
                        tempCost = Math.min(tempCost,tempCostX);

                    }
                    dp[i][j] = Math.min(tempCost,dp[i][j-1]);
                }
            }
        }
        return dp[arr.length-1][2];
    }
}