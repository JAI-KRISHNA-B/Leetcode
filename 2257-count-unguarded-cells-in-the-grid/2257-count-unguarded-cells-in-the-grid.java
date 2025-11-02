class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int matrix[][] = new int[m][n];
        int a = 0;
        int b = 0;
        int count = 0;
        for(int i=0;i<guards.length;i++){
            matrix[guards[i][0]][guards[i][1]] = 3;
        }
        for(int i=0;i<walls.length;i++){
            matrix[walls[i][0]][walls[i][1]] = 1;
        }
        for(int i=0;i<guards.length;i++){
            int x = guards[i][0];
            int y = guards[i][1];
            a = x-1;
            b = y;
            while(a>=0){
                if(matrix[a][b]==3 || matrix[a][b]==1)
                break;
                matrix[a][b] = 2;
                a-=1;
            }
            a = x+1;
            b = y;
            while(a<m){
                if(matrix[a][b]==3 || matrix[a][b]==1)
                break;
                matrix[a][b] = 2;
                a+=1;
            }
            a = x;
            b = y+1;
            while(b<n){
                if(matrix[a][b]==3 || matrix[a][b]==1)
                break;
                matrix[a][b] = 2;
                b+=1;
            }
            a = x;
            b = y-1;
            while(b>=0){
                if(matrix[a][b]==3 || matrix[a][b]==1)
                break;
                matrix[a][b] = 2;
                b-=1;
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0)
                count+=1;
            }
        }

        return count;
    }
}