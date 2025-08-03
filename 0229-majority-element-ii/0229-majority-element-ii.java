class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // MOORE'S VOTING ALGORITHM ---> OPTIMAL APPROACH

        int count1 = 0;
        int count2 = 0;
        int element1 = 0;
        int element2 = 0;
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(count1==0 && nums[i]!=element2){
                count1+=1;
                element1=nums[i];
            }
            else if(count2==0 && nums[i]!=element1){
                count2+=1;
                element2=nums[i];
            }
            else if(nums[i]==element1){
                count1+=1;
            }
            else if(nums[i]==element2){
                count2+=1;
            }
            else{
                count1-=1;
                count2-=1;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element1){
                count1+=1;
            }
            else if(nums[i]==element2){
                count2+=1;
            }
        }
        if(count1>(nums.length/3)){
            res.add(element1);
        }
        if(count2>(nums.length/3)){
            res.add(element2);
        }
        return res;
    }
}