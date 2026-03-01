// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {

//         int minval = 1;
//         int maxval = 0;

//         for(int pile : piles){
//             maxval = Math.max(maxval, pile);
//         }

//         while(minval <= maxval){
//             int mid = minval + (maxval - minval)/2;

//             if(caneat(piles, h, mid)){
//                 maxval = mid - 1;
//             }
//             else{
//                 minval = mid + 1;
//             }
//         }

//         return minval;
//     }

//     public boolean caneat(int piles[], int h, int speed){
//         long hour = 0;

//         for(int pile : piles){
//             hour += (pile + speed - 1) / speed;  // better than Math.ceil
//         }

//         return hour <= h;
//     }
// }