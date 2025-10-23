class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // IMPLEMENTING A BINARY SEARCH

        int maxdays = 0,mindays=bloomDay[0];

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>maxdays)
            maxdays=bloomDay[i];
            if(bloomDay[i]<mindays)
            mindays=bloomDay[i];
        }

        int low=mindays,high=maxdays;

        int ans=-1;

        while(low<=high){

            int mid = (low+high)/2;

            int count=0,bouquets=0;

            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    count+=1;
                }else{
                    count=0;
                }
                if(count==k){
                    bouquets+=1;
                    count=0;
                }
            }if(bouquets>=m){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }if(ans==-1)
        return -1;
        else
        return ans;
    }
}

//TC:  o(n * log(m))  m--> (max(bloomDay)-min(bloomDay)-1)

//SC:  o(1)