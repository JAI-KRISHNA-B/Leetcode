class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        // BRUTE FORCE APPROACH

        int count=0,max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
            count+=1;
            if(count>max)
            max=count;
            if(nums[i]==0)
            count=0;
        }
        return max;
    }
}

//tc:  o(n)

//sc:  o(1)