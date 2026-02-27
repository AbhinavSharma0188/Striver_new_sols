// class Solution {
//     public int search(int[] nums, int target) {
//         return helper(nums, target, 0, nums.length - 1);
//     }

//     public int helper(int[] arr, int target, int si, int ei) {
//         while (si <= ei) {
//             int mid = si + (ei - si) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             } 
//             else if (arr[mid] > target) {
//                 ei = mid - 1;
//             } 
//             else {
//                 si = mid + 1;
//             }
//         }
//         return -1;
//     }
// }