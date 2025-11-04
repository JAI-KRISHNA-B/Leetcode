import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
        int stop = c + k - 1;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (i == stop) {
                List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
                list.sort((a, b) -> {
                    if (!a.getValue().equals(b.getValue())) {
                        return b.getValue() - a.getValue(); 
                    }
                    return b.getKey() - a.getKey(); 
                });

                int sum = 0;
                int count = 0;
                for (Map.Entry<Integer, Integer> e : list) {
                    if (count == x) break;
                    sum += e.getKey() * e.getValue();
                    count++;
                }

                res[c] = sum;
                
                int removeVal = nums[c];
                map.put(removeVal, map.get(removeVal) - 1);
                if (map.get(removeVal) == 0) map.remove(removeVal);

                c++;
                stop++;
            }
        }

        return res;
    }
}
