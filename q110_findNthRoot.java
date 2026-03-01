public class q110_findNthRoot {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        int si = 1;
        int ei = m;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            int val = findVal(n, mid, m);  // ✅ fixed

            if (val == 1) {
                System.out.println(mid);
                return;
            }
            else if (val == 2) {
                ei = mid - 1;
            }
            else {
                si = mid + 1;   // ✅ moved inside else
            }
        }

        System.out.println(-1);
    }

    public static int findVal(int n, int mid, int m) {
        long val = 1;   // ✅ use long

        for (int i = 0; i < n; i++) {
            val *= mid;

            if (val > m) return 2;  // ✅ early stop
        }

        if (val == m) return 1;
        else return -1;
    }
}