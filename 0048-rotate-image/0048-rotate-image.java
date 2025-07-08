class Solution {
    public void rotate(int[][] matrix) {

        int row = matrix.length;

        int col = matrix[0].length;
        int c = 0;

        for(int i=0;i<row;i++){
            int j=c+1;
            while(j<col){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                j+=1;
            }c+=1;
        }

        for(int i=0;i<row;i++){
            reverse(matrix,i,0,col-1);
        }
    }

    void reverse(int[][] matrix,int i,int j,int k){
        while(j<k){
            int temp = matrix[i][k];
            matrix[i][k] = matrix[i][j];
            matrix[i][j] = temp;
            j+=1;
            k-=1;
        }
    }
}