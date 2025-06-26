class Solution {
    public int longestConsecutive(int[] nums) {

//         BETTER APPROACH
//         if(nums.length==0)
//         return 0;

//         Arrays.sort(nums);

//         int start = nums[0], count = 1, max = 1;

//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==start){
//                 continue;
//             }

//             else if(nums[i]==start+1){
//             count+=1;
//             start=nums[i];
//             }

//             else{
//                 if(max<count)
//                 max=count;
//                 count=1;
//                 start=nums[i];
//             }
//         }
//         return Math.max(max,count);

//     OPTIMAL

        if(nums.length==0)
        return 0;

        HashSet<Integer> set = new HashSet<>();

        int max = 1;

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }

        for(int x:set){

            int count = 1;

            if(set.contains(x-1)){
                continue;
            }else{
                int d = x+1;
                while(set.contains(d)){
                    d+=1;
                    count+=1;
                }
            }
            if(max<count)
            max=count;
        }

        return max;

    }
}

