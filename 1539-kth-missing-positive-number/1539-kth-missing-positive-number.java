class Solution {
    public int findKthPositive(int[] arr, int k) {

//         // JUST DID THIS BRUTE FORCE WITH JUST BASIC MATH
        
//         int ans = arr[arr.length-1]+k;
//         int prev = 0;
//         int mis = k;

//         for(int i=0;i<arr.length;i++){
//             int val = (arr[i] - prev)-1;
//             mis-=val;
//             if(mis<=0){
//                 System.out.print(mis);
//                 ans = prev+val-Math.abs(mis);
//                 break;
//             }prev=arr[i];
//         }
//         if(mis<=0)
//         return ans;
//         else
//         return arr[arr.length-1]+mis; // edge case we need to consider...
//     }
// }

// TC: O(N)

// SC: O(1)

        // MATH WITH BINARY SEARCH

        int low = 0;
        int high = arr.length-1;

        while(low<=high){

            int mid = low + (high-low) / 2;

            int mis = (arr[mid]-(mid+1));

            if(mis<k)
            low = mid+1;

            else
            high = mid-1;
        }

        if(high<0)
        return k;

        else{

            int more = k - (arr[high]-(high+1));

            return arr[high]+more;
        }
    }
}

// TC: O(LOG N)

// SC: O(1)