// class Solution {
//     public double findMedianSortedArrays(int[] arr1, int[] arr2) {
//         int m = arr1.length;
//         int n = arr2.length;

//         int i = 0, j = 0, k = 0;

//         int temp[] = new int[m + n];

//         while (i < m && j < n) {
//             if (arr1[i] < arr2[j]) {
//                 temp[k] = arr1[i];
//                 i++;
//             } else {
//                 temp[k] = arr2[j];
//                 j++;
//             }
//             k++;
//         }

//         while (i < m) {
//             temp[k++] = arr1[i++];
//         }

//         while (j < n) {
//             temp[k++] = arr2[j++];
//         }

//         int size = m + n;

//         if (size % 2 == 1) {
//             return temp[size / 2];
//         } else {
//             return (temp[size / 2] + temp[size / 2 - 1]) / 2.0;
//         }
//     }
// }