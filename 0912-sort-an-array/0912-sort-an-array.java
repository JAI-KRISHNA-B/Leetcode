class Solution {
    public int[] sortArray(int[] arr) {
        
        // merge sort ---> DIVIDE AND CONQUER

        divide(arr,0,arr.length-1);
        return arr;
    }

    void divide(int[] arr,int low,int high){

        if(low==high)
        return;

        int mid = low + (high-low)/2;

        divide(arr,low,mid);
        divide(arr,mid+1,high);

        sort(arr,low,mid,high);
    }

    void sort(int[] arr,int low,int mid,int high){
        int l = low;
        int r = mid+1;
        int c = 0;
        List<Integer> temp = new ArrayList<>();

        while(l<=mid && r<=high){
            if(arr[l]<=arr[r]){
                temp.add(arr[l]);
                l+=1;
            }else{
                temp.add(arr[r]);
                r+=1;
            }
        }

        while(l<=mid){
            temp.add(arr[l]);
            l+=1;
        }
        while(r<=high){
            temp.add(arr[r]);
            r+=1;
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp.get(c);
            c+=1;
        }
    }
}