class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
            left+=1;

            while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
            right-=1;

            if(left<right){
            int s1 = Character.toLowerCase(s.charAt(left));
            int s2 = Character.toLowerCase(s.charAt(right));

            if(s1!=s2)
            return false;
            }

            left+=1;
            right-=1;

        }
        return true;
    }
}