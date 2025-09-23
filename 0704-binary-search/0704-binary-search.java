class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        int tar = -1;

        while(low<=high){
            int mid = low + (high-low) / 2;

            if(nums[mid]==target){
                tar = mid;
                break;
            }
            else if(nums[mid]>target)
            high = high - 1;
            else
            low = low + 1;
        }

        return tar;
    }
}