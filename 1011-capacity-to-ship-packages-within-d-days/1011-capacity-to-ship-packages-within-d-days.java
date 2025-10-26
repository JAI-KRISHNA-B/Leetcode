class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = 0, high = 0;
        int ans = -1;

        for(int i=0;i<weights.length;i++){
            if(low<weights[i])
            low = weights[i];
            high+=weights[i];
        }

        while(low<=high){

            int mid = low + (high-low) / 2;
            int sum = 0;
            int d = 0;

            for(int i=0;i<weights.length;i++){
                sum+=weights[i];
                if(sum>mid){
                    sum=weights[i];
                    d+=1;
                }
            }
            if(d>days || (d==days && sum!=0))
            low = mid + 1;
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}