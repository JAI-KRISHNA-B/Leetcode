class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                if(Character.isUpperCase(s.charAt(i))){
                    str += Character.toLowerCase(s.charAt(i));
                }else{
                    str += s.charAt(i);
                }
            }
        }

        int l=0,r=str.length()-1;

        while(l<r){
            if(str.charAt(l)!=str.charAt(r))
            return false;
            l+=1;
            r-=1;
        }

        return true;

    }
}