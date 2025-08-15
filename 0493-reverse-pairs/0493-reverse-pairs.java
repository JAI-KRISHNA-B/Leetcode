class Solution {

    int count = 0;

    public int reversePairs(int[] nums) {

        merge(nums,0,nums.length-1);
        return count;
    }

    void merge(int[] nums,int low,int high){

        if(low>=high)
        return;

        int mid = low + (high-low) / 2;

        merge(nums,low,mid);
        merge(nums,mid+1,high);
        count+=revpair(nums,low,mid,high);
        sort(nums,low,mid,high);
    }

    void sort(int[] nums,int low,int mid,int high){

        int l = low;
        int h = mid+1;
        int c = 0;
        List<Integer> temp = new ArrayList<>();

        while(l<=mid && h<=high){
            if(nums[l]<=nums[h]){
                temp.add(nums[l]);
                l+=1;
            }else{
                temp.add(nums[h]);;
                h+=1;
            }
        }
        while(l<=mid){
            temp.add(nums[l]);
            l+=1;
        }
        while(h<=high){
            temp.add(nums[h]);
            h+=1;
        }


        for(int i=low;i<=high;i++){
            nums[i] = temp.get(c);
            c+=1;
        }

    }

    int revpair(int[] nums,int low,int mid,int high){

        int l = low;
        int h = mid+1;
        int c = 0;

        while(l<=mid && h<=high){
            if((long)nums[l]>2L*nums[h]){
                c+=(mid-l)+1;  // Main idea basically
                h+=1;
            }else{
                l+=1;
            }
        }
        return c;
    }
}