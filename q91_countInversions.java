// class Solution {

//     static int count = 0;

//     public int inversionCount(int[] arr) {
//         Sort(arr, 0, arr.length - 1);
//         return count;
//     }

//     public static int[] Sort(int arr[], int si, int ei) {
//         if (si == ei) {
//             int bs[] = new int[1];
//             bs[0] = arr[si];
//             return bs;
//         }

//         int mid = (si + ei) / 2;

//         int fs[] = Sort(arr, si, mid);
//         int ss[] = Sort(arr, mid + 1, ei);

//         return MergeSortedArrays(fs, ss);
//     }

//     public static int[] MergeSortedArrays(int arr1[], int arr2[]) {

//         int m = arr1.length;
//         int n = arr2.length;
//         int newArray[] = new int[m + n];

//         int i = 0, j = 0, k = 0;

//         while (i < m && j < n) {

//             if (arr1[i] <= arr2[j]) {
//                 newArray[k++] = arr1[i++];
//             } else {
//                 newArray[k++] = arr2[j++];
                
//                 // ⭐ inversion logic
//                 count += (m - i);
//             }
//         }

//         while (i < m) newArray[k++] = arr1[i++];
//         while (j < n) newArray[k++] = arr2[j++];

//         return newArray;
//     }
// }