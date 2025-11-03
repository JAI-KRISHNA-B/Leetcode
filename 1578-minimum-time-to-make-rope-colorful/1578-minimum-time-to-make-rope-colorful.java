class Solution {
    public int minCost(String colors, int[] neededTime) {
        char prevchar = colors.charAt(0);
        int prevtime = neededTime[0];
        int totaltime = 0;

        for(int i=1;i<colors.length();i++){
            if(prevchar==colors.charAt(i)){
                if(prevtime>neededTime[i])
                totaltime+=neededTime[i];
                else{
                totaltime+=prevtime;
                prevtime = neededTime[i];
                }
            }else{
                prevchar = colors.charAt(i);
                prevtime = neededTime[i];
            }
        }

        return totaltime;
    }
}