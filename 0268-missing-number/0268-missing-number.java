class Solution {
    public int missingNumber(int[] nums) {

        // SUM OF NATURAL NUMBERS FORMULA WE CAN USE HERE
        // N*(N+1)/2

        int num = nums.length*(nums.length+1);

        int res = num/2;
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        return res-sum;   
    }
}