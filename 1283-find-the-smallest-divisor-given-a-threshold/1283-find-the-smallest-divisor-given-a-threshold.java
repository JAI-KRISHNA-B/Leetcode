class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        // BINARY SEARCH

        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = -1;

        while(low<=high){

            int mid = low + (high-low) / 2;
            System.out.print(mid);
            int sum = 0;

            for(int i=0;i<nums.length;i++){
                sum+=(nums[i]+mid-1)/mid;   
                // TO FIND A CEIL VALUE WE USE THIS FORMULA (A+B-1)/B
            }

            if(sum>threshold)
            low = mid + 1;

            else{
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;

    }
}