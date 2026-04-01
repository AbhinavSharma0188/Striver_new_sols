class Solution {
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        int n = 5;

        if (isOdd(n)) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}