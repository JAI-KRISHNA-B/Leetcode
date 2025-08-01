class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            int ans = 1;
            int num = i;
            int den = 1;
            List<Integer> list = new ArrayList<>();
            list.add(ans);
            for(int j=1;j<i+1;j++){
                ans = ans * num;
                ans = ans/den;
                num-=1;
                den+=1;
                list.add(ans);
            }
            result.add(list);
        }
        return result;
    }
}