class Solution {
    public boolean search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;

        while(low<=high){

            int mid = low + (high-low) / 2;

            if(nums[mid]==target){
                return true;
            }

            while(low<=high && nums[mid]==nums[low] && nums[low]==nums[high]){
                low+=1;
                high-=1;
            }
            // Basically this is the main point if low==mid==high means def it is not the target becoz it is already checked mid is not the target means low and high cannot be target aswell so we are trimming the low and high  

            if(low>high)
            break;

            if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target<=nums[mid]){
                    high-=1;
                }else{
                    low+=1;
                }
            }else{
                if(target>=nums[mid] && target<=nums[high]){
                    low+=1;
                }else{
                    high-=1;
                }
            }
}

        return false;

}
}

// TC:  O(LOGN)

// IF SOMETHING LIKE [3,3,1,3,3,3,3]
// THEN THE TC IS N/2 IN THE WORST CASE

// SC:  O(1)