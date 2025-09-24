class Solution {
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        int c = 0;
        int mid = 0;

        while(low<=high){

            mid = low + (high-low) / 2;

            if(nums[mid]==target){
                c+=1;
                break;
            }
            else if(nums[mid]>target)
            high = high-1;
            else 
            low = low+1;
        }
        if(c>=1)
        return mid;
        return high+1;

    }
}