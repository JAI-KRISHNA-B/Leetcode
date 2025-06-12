class Solution {
    public void sortColors(int[] nums) {

        // we are going to use a three pointers here

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(low<=high){
            if(nums[low]==0){
                nums[low]=nums[mid];
                nums[mid]=0;
                mid+=1;
                low+=1;
            }
            else if(nums[low]==2){
                nums[low]=nums[high];
                nums[high]=2;
                high-=1;
            }
            else{
                low+=1;
            }
        }
    }
}