// import java.util.*;

// class Solution {
//     public int[][] merge(int[][] intervals) {
//         if (intervals.length == 0) return new int[0][0];
        
//         // Step 1: Sort intervals by starting time
//         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
//         List<int[]> res = new ArrayList<>();
//         res.add(new int[]{intervals[0][0], intervals[0][1]});
        
//         // Step 2: Iterate through intervals
//         for (int i = 1; i < intervals.length; i++) {
//             int[] last = res.get(res.size() - 1);
//             int[] curr = intervals[i];
            
//             if (curr[0] <= last[1]) {
//                 // Overlapping → merge
//                 last[1] = Math.max(last[1], curr[1]);
//             } else {
//                 // No overlap → add new interval
//                 res.add(new int[]{curr[0], curr[1]});
//             }
//         }
        
//         return res.toArray(new int[res.size()][]);
//     }
// }
