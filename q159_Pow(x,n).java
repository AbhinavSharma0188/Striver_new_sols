// class Solution {
//     public double myPow(double x, long n) {
//         if (n == 0) return 1;

//         if (n < 0) {
//             return myPow(1 / x, -n);
//         }

//         double half = myPow(x * x, n / 2);

//         if (n % 2 == 0) {
//             return half;
//         } else {
//             return x * half;;
//         }
//     }
// }