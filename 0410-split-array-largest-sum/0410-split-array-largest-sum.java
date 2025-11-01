class Solution {
    public int splitArray(int[] nums, int k) {

        int low = Arrays.stream(nums).max().getAsInt();

        int high = Arrays.stream(nums).sum();
        int min = Integer.MAX_VALUE;

        while(low<=high){

            int mid = low + (high-low) / 2;

            int arrays = 1;
            int sum = 0;
            int max = 0;

            for(int i=0;i<nums.length;i++){

                if(sum + nums[i]<=mid){
                    sum+=nums[i];
                }else{
                    arrays+=1;
                    sum = nums[i];
                }if(sum>max)
                max=sum;
            }

            if(arrays<=k){
                if(min>max)
                min=max;
                high=mid-1;
            }else
            low = mid + 1;         
        }
        return min;

    }
}