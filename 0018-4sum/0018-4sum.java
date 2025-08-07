class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        // OPTIMAL APPROACH  --->> TWO POINTER APPROACH

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        int i = 0;

        while(i<nums.length-3){

            int prev1 = nums[i];
            int j=i+1;

            while(j<nums.length-2){

                int prev2 = nums[j];

                int k = j+1;
                int l = nums.length-1;

                while(k<l){
                    int prev3 = nums[k];
                    int prev4 = nums[l];
                    long sum = 1L * nums[i]+nums[j]+nums[k]+nums[l];

                    if(sum==target){
                        res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
                        while(k<l && prev3==nums[k])
                        k+=1;
                        while(k<l && prev4==nums[l])
                        l-=1;
                 }
                 else if(sum<target)
                 k+=1;
                 else
                 l-=1;
              }
            while(j<nums.length-2 && prev2==nums[j])
            j+=1;
            }
            while(i<nums.length-3 && prev1==nums[i])
            i+=1;
        }

        return res;

    }
}