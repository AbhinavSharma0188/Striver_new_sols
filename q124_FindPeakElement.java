// class Solution {
//     public int[] findPeakGrid(int[][] mat) {
//         int l = 0, r = mat.length - 1;

//         while (l < r) {
//             int mid = (l + r) / 2;
//             int j = maxPos(mat[mid]);

//             // If current row’s max is greater than the next row’s max,
//             // a peak must be in [l..mid]
//             if (mat[mid][j] > mat[mid + 1][j]) {
//                 r = mid;
//             } else {
//                 l = mid + 1;
//             }
//         }

//         // l == r, now find the max in the final row
//         return new int[] {l, maxPos(mat[l])};
//     }

//     // Find index of maximum element in a 1D array
//     private int maxPos(int[] arr) {
//         int j = 0;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > arr[j]) {
//                 j = i;
//             }
//         }
//         return j;
//     }
// // 