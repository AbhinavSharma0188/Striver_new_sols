// // User function Template for Java

// class Solution {
//     public int rowWithMax1s(int arr[][]) {
//         // code here
//         int n=arr.length;
//         int m=arr[0].length;
//         int ans=0;
//         int ones=0;
//         for(int i=0;i<=n-1;i++){
//             int lower=lowerBound(arr[i],1);
//             int one=m-lower;
//             if(one>ones){
//                 ones=one;
//                 ans=i;
                
//             }
//         }
//         return ans;
        
        
//     }
//     public static int lowerBound(int arr[],int x){
//         int i=0;
//         int j=arr.length-1;
//         int ans=0;
//         while(i<=j){
//             int mid=i+(j-i)/2;
//             if(arr[mid]>=x){
//                 ans=mid;
//                 j=mid-1;
                
//             }
//             else{
//                 i=mid+1;
//             }
//         }
//         return ans;
//     }
// }