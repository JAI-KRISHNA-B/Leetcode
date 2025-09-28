class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
        int start = -1;
        int end = -1;

        while(low<=high){

            int mid = low + (high - low) / 2;

            if(nums[mid]>=target){
                if(nums[mid]==target)
                start = mid;
                high = high - 1;
            }else
            low = low + 1;
        }

        if(start==-1)
        return new int[] {-1,-1};

        low = 0;
        high = nums.length-1;

        while(low<=high){

            int mid = low + (high-low) / 2;

            if(nums[mid]<=target){
                if(nums[mid]==target)
                end = mid;
                low = low + 1;
            }else
            high = high - 1;
        }

        return new int[] {start,end};


    }
}