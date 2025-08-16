class Solution {
    public int maxProduct(int[] nums) {

        int prefix = 1;
        int suffix = 1;
        int max1 = nums[0];
        int max2 = nums[0];

        for(int i=0;i<nums.length;i++){

            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];

            if(prefix>max1)
                max1 = prefix;
            if(suffix>max2)
                max2 = suffix;

            if(prefix==0)
            prefix=1;
            if(suffix==0)
            suffix=1;
        }

        if(max1>max2)
        return max1;
        return max2;
        
    }
}