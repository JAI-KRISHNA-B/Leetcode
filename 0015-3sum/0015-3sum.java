class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // // BETTER APPROACH USING HASHING METHOD

        // Set<List<Integer>> st = new HashSet<>();

        // int end = nums.length-3;

        // for(int i=0;i<end;i++){

        //     Set <Integer> hash = new HashSet<>();
        //     for(int j=i+1;j<nums.length;j++){

        //         int third = -(nums[i]+nums[j]);

        //         if(hash.contains(third)){
        //             List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
        //             temp.sort(null);
        //             st.add(temp);
        //         }

        //         hash.add(third);
        //     }
        // }

        // List<List<Integer>> threesum = new ArrayList<>(st);
        

        // return threesum;


        // OPTIMAL APPROACH

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        int i = 0;

        while(i<nums.length-2){
            
            int prev1 = nums[i];
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int prev2 = nums[j];
                int prev3 = nums[k];
                int sum = nums[i]+nums[j]+nums[k];

                if(sum==0){
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    while(j<k && prev2==nums[j]){
                        j+=1;
                    }
                    while(j<k && prev3==nums[k]){
                        k-=1;
                    }
                }
                else if(sum<0){
                    j+=1;
                }
                else{
                    k-=1;
                }
            }
            while(i<nums.length-2 && prev1==nums[i])
            i+=1;
        }

        return res;

        





        
    }
}