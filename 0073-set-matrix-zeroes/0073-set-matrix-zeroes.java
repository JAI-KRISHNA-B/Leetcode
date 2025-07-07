class Solution {
    public void setZeroes(int[][] matrix) {

        // int m = matrix.length;

        // int n = matrix[0].length;

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             if(j==0){
        //                 k=j;
        //             }else{
        //                 matrix[0][j]=0;
        //             }
        //             matrix[i][0]=0;
        //         }
        //     }
        // }


        int row = matrix.length;
        int col = matrix[0].length;
        int col0 = 1;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    if(j==0)
                        col0 = 0;
                    else
                        matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j] = 0;
            }
        }

        for(int j=col-1;j>=1;j--){
            if(matrix[0][0]==0 || matrix[0][j]==0)
            matrix[0][j] = 0;
        }
        for(int i=0;i<row;i++){
            if(col0==0 || matrix[i][0]==0)
            matrix[i][0] = 0;
        }
    }
}