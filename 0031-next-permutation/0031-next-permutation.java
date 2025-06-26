class Solution {
    public void nextPermutation(int[] nums) {

        int breakpoint = -1;
        int temp = 0;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                breakpoint = i;
                break;
            }
        }
        if(breakpoint==-1){
            reverse(nums,0,nums.length-1);
        }else{
        for(int i=nums.length-1;i>breakpoint;i--){
            if(nums[i]>nums[breakpoint]){
                temp = nums[breakpoint];
                nums[breakpoint] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums,breakpoint+1,nums.length-1);
        }
    }
    void reverse(int[] nums,int low,int high){
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low+=1;
            high-=1;
        }
    }
}