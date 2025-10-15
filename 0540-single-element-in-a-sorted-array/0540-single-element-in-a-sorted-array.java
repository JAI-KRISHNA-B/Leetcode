class Solution {
    public int singleNonDuplicate(int[] nums) {

        // (even,odd) --> remove left half
        // (odd,even) --> remove right half
        
        int n = nums.length;

        if(n==1)
        return nums[0];

        if(nums[0]!=nums[1])
        return nums[0];

        if(nums[n-1]!=nums[n-2])
        return nums[n-1];

        int low = 1;
        int high = nums.length-2;
        int ans = 0;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(nums[mid]==nums[mid-1]){
                if((mid-1)%2==0)
                low=mid+1;
                else
                high=mid-1;
            }else if(nums[mid]==nums[mid+1]){
                if((mid+1)%2==0)
                high=mid-1;
                else
                low=mid+1;
            }else{
                ans = nums[mid];
                break;
            }
        }
        return ans;
    }
}