class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        // optimal approach

        int row = matrix.length;

        int col = matrix[0].length;

        List<Integer>res = new ArrayList<>();

        int left=0,right=col-1,top=0,bottom=row-1;
        
        while(left<=right && top<=bottom){

            // LEFT TO RIGHT
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }top++;

            // TOP TO BOTTOM
            for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }right--;

            // RIGHT TO LEFT
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                res.add(matrix[bottom][i]);
            }}bottom--;

            // BOTTOM TO TOP
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                res.add(matrix[i][left]);
            }}left++;
        }

        return res;
    }
}


//TC:  O(ROW*COL)

//SC:  O(ROW*COL)