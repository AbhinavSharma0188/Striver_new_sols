// class Solution {
//     public int shipWithinDays(int[] arr, int days) {
//         int si=0;
//         int ei=0;
//         for(int i=0;i<=arr.length-1;i++){
//             ei=ei+arr[i];
//             if(si<=arr[i]){
//                 si=arr[i];
//             }
//         }
//         int res=ei;
//        while(si<=ei){
//         int mid=si+(ei-si)/2;
//         if(canbeShipped(arr,mid)<=days){
//             ei=mid-1;
//             res=mid;

//         }
//         else{
//             si=mid+1;
//         }

//        }
//        return res;
       
        
//     }
//     public static int canbeShipped(int arr[],int capacity){
//         int ships=1;
//         int currentCapacity=0;
//         for(int w:arr){
//            currentCapacity=currentCapacity+w;
//            if(currentCapacity>capacity){
//             ships++;
//             currentCapacity=w;
//            }
//         }
//         return ships;
//        }
// }