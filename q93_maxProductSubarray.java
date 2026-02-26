// class Solution {
//     public int maxProduct(int[] arr) {
        
//         int ans = Integer.MIN_VALUE;
//         int prefix = 1;
//         int suffix = 1;

//         for(int i = 0; i < arr.length; i++){
            
//             if(prefix == 0) prefix = 1;
//             if(suffix == 0) suffix = 1;

//             prefix *= arr[i];
//             suffix *= arr[arr.length - 1 - i];

//             ans = Math.max(ans, Math.max(prefix, suffix));
//         }
//         return ans;
//     }
// }