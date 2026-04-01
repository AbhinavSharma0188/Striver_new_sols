class Solution {
    public static boolean isIthBitSet(int n, int i) {
        if ((n & (1 << i)) != 0) {
            return true;  // bit is set
        } else {
            return false; // bit is not set
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 1;

        System.out.println(isIthBitSet(n, i));
    }
}