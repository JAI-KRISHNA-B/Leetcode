class Solution {
    public int lengthOfLongestSubstring(String s) {

        // SLIDING WINDOW APPROACH

        int start = 0;
        int end = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        while(end<s.length()){

            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start+=1;
            }

            set.add(s.charAt(end));
            int windowsize = end - start + 1;
            if(max<windowsize)
            max = windowsize;
            end+=1;
        }

        return max;
    }
}