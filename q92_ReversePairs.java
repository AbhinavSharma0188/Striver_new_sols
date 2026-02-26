// class Solution {

//     static int count;

//     public int reversePairs(int[] arr) {
//         count = 0;  // ⭐ IMPORTANT RESET
//         Sort(arr, 0, arr.length - 1);
//         return count;
//     }

//     public static int[] Sort(int arr[], int si, int ei) {

//         if (si == ei) {
//             return new int[]{arr[si]};
//         }

//         int mid = (si + ei) / 2;

//         int fs[] = Sort(arr, si, mid);
//         int ss[] = Sort(arr, mid + 1, ei);

//         countPairs(fs, ss);   // count before merge

//         return MergeSortedArrays(fs, ss);
//     }

//     public static void countPairs(int arr1[], int arr2[]) {
//         int j = 0;

//         for (int i = 0; i < arr1.length; i++) {
//             while (j < arr2.length && (long) arr1[i] > 2L * arr2[j]) {
//                 j++;
//             }
//             count += j;
//         }
//     }

//     public static int[] MergeSortedArrays(int arr1[], int arr2[]) {

//         int m = arr1.length, n = arr2.length;
//         int newArray[] = new int[m + n];

//         int i = 0, j = 0, k = 0;

//         while (i < m && j < n) {
//             if (arr1[i] <= arr2[j]) newArray[k++] = arr1[i++];
//             else newArray[k++] = arr2[j++];
//         }

//         while (i < m) newArray[k++] = arr1[i++];
//         while (j < n) newArray[k++] = arr2[j++];

//         return newArray;
//     }
// }