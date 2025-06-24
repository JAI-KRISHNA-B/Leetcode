class Solution {
    public void rotate(int[] arr, int k) {

        int n = arr.length;

        k = k%n;

        reverse(arr,0,n-k-1);

        reverse(arr,n-k,n-1);

        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr,int x,int y){
        while(x<y){
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x+=1;
            y-=1;
        }
    }
}