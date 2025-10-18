class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // A SIMPLE LINEAR SEARCH
        /*

        int maxhours=0,ans=0;

        for(int i=0;i<piles.length;i++){
            if(piles[i]>maxhours)
            maxhours=piles[i];
        }

        //System.out.print(maxhours);

        for(int i=1;i<=maxhours;i++){
            int hours=0;
            for(int j=0;j<piles.length;j++){
                hours+=(int)Math.ceil((double)piles[j]/i);
                //System.out.println(hours);
                if(hours>h){
                    break;
                }
            }if(hours<=h){
                ans=i;
                break;
            }
        }return ans;

        */

         // IMPLEMENTING A BINARY SEARCH

         int maxhours=0;

         for(int i=0;i<piles.length;i++){
            if(piles[i]>maxhours)
            maxhours=piles[i];
        
         }

         int low=1,high=maxhours;

         while(low<=high){
            int mid = (low+high)/2;
            int hours=0;
            for(int i=0;i<piles.length;i++){
                hours+=(int)Math.ceil((double)piles[i]/mid);
                if(hours>h){
                    low=mid+1;
                    break;
                }
            }if(hours<=h){
                high=mid-1;
            }
         }
         return low;
    }
}


//TC:  O(N * LOG M)  M--> MAX(PILES)


//SC:  O(1)