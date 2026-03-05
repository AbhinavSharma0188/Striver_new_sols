// class Solution {
//     public int aggressiveCows(int[] arr, int k) {
//         // code here
//         Arrays.sort(arr);
//         int low=1;
//         int high=arr[arr.length-1];
//         int ans=0;
//         while(low<=high){
//             int mid=low+(high-low)/2;
//             if(isItpossible(arr,mid,k)){
//                 ans=mid;
//                 low=mid+1;
                
//             }
//             else{
//                 high=mid-1;
//             }
           
//         }
//          return ans;
       
        
        
//     }
//      public static boolean isItpossible(int arr[],int mid,int noc){
//             int fc=arr[0];
//             int count=1;
//             for(int i=1;i<=arr.length-1;i++){
//                 if(arr[i]-fc>=mid){
//                     count++;
//                     fc=arr[i];
//                 }
//                 if(count==noc){
//                     return true;
//                 }
//             }
//             return false;
//         }
// }