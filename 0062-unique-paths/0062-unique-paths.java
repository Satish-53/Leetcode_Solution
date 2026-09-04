class Solution{
    public int uniquePaths(int m,int n){
        int[][] path=new int[m][n];
        // each cell ko initially 1 se fill karna
        for (int i=0;i<m;i++){
            path[i][0]=1;
        }
        for (int j=0;j<n;j++){
            path[0][j]=1;
        }
        // remaining cells ke paths calculate karna
        for (int row=1;row<m;row++){
            for (int col=1;col<n;col++){
                int fromTop=path[row-1][col];
                int fromLeft=path[row][col-1];
                path[row][col]=fromTop+fromLeft;
            }
        }
        return path[m - 1][n - 1];
    }
}