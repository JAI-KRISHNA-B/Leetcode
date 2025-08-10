class Solution {
    public int[][] merge(int[][] intervals) {

        // int i = 0;
        // int c = 0;

        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // List<int[]> result = new ArrayList<>(); // Use dynamic list

        // while (i < intervals.length) {
        //     int left = intervals[i][0];
        //     int right = intervals[i][1];
        //     int j = i + 1;
        //     int d = 1;

        //     while (j < intervals.length) {
        //         d = 0;
        //         if (right >= intervals[j][0]) {
        //             if (right < intervals[j][1]) {
        //                 right = intervals[j][1];
        //             }
        //             i = j + 1;
        //         } else {
        //             d += 1;
        //             break;
        //         }
        //         j += 1;
        //     }
        //     if (d >= 1)
        //         i = j;

        //     result.add(new int[]{left, right}); // Add only valid intervals
        //     c += 1;
        // }

        // // Convert list to array before returning
        // return result.toArray(new int[result.size()][]);


        if(intervals.length<=1){
            return intervals;  // edge case
        }

        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        int[] last = intervals[0];
        result.add(last);

        for(int i=1;i<intervals.length;i++){

            int start = intervals[i][0];
            int end = intervals[i][1];

            if(start<=last[1]){
                if(end>last[1]){
                    last[1] = end;
                }
            }else{
                last = intervals[i];
                result.add(last);
            }
        }

        return result.toArray(new int[result.size()][]);


    }
}