class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int r=original.length;
        int[][] reshaped=new int[m][n];
        if(r!=m*n)
        {
            return new int[0][0];
        }
        for(int i=0;i<r;i++)
        {
            reshaped[i/n][i%n]=original[i];
        }
        return reshaped;
    }
}
