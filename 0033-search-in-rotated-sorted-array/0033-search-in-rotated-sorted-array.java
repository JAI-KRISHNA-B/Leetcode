class Solution {
    public int search(int[] nums, int target) {

    //  IDENTIFY THE SORTED HALF AND THEN DO THE BINARY SEARCH
        
        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low<=high){

            int mid = low + (high-low) / 2;

            if(nums[mid]==target){
                ans = mid;
                break;
            }

            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && nums[mid]>=target){
                    high-=1;
                }else{
                    low+=1;
                }
            }else{
                if(target>=nums[mid] && nums[high]>=target){
                    low+=1;
                }else{
                    high-=1;
                }
            }
        }

        return ans;
    }
}