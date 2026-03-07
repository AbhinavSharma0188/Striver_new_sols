// class Solution {
//     public boolean searchMatrix(int[][] arr, int item) {
//        int i = 0;
//         int j = arr[0].length - 1;


//         while(i < arr.length && j >= 0){
//             if(arr[i][j] == item){
//                 return true;
//             }
//             else if(arr[i][j] > item){
//                 j--;
//             }
//             else{
//                 i++;
//             }
//         }
//         return false;

//     }
// }