class Solution {
    public int removeDuplicates(int[] nums) {
         
         // TWO POINTER ALGORITHM

         int left = 1;
         int right = 1;
         int prev = nums[0];

         while(right<nums.length){
            if(prev!=nums[right]){
                nums[left] = nums[right];
                prev = nums[right];
                left+=1;
            }right+=1;
         }
         return left;
    }
}