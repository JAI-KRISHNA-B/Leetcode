class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int sqrt = 0;

        while(low<=high){
            int mid = low + (high-low) / 2;
            long num = (long) mid * mid;

            if(num==x)
            return mid;

            else if(num>x)
            high = mid - 1;

            else{
                sqrt = mid;
                low = mid+1;
            }
        }
        return sqrt;
    }
}