// import java.util.*;
// class Solution {
//     public int[] findMissingAndRepeatedValues(int[][] arr) {
//         HashSet<Integer> set=new HashSet<>();
//         int arr1[]=new int[2];
//         for(int i=0;i<=arr.length-1;i++){
//             for(int j=0;j<=arr[0].length-1;j++){
//                 if(set.contains(arr[i][j])){
//                     arr1[0]=arr[i][j];
//                 }
//                 set.add(arr[i][j]);
//             }
//         }
//         int n=arr.length;
//         for(int i=1;i<=n*n;i++){
//             if(!set.contains(i)){
//                 arr1[1]=i;

//             }
//         }
//         return arr1;
        
//     }
// }