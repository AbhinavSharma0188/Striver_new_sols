class Solution {
    public int findPages(int[] arr, int k) {

        if (k > arr.length) return -1;   // 🔥 Missing condition

        int low = 0;
        int high = 0;

        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isItpossible(arr, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean isItpossible(int arr[], int mid, int k) {

        int student = 1;
        int readpage = 0;

        for (int i = 0; i < arr.length; i++) {

            if (readpage + arr[i] <= mid) {
                readpage += arr[i];
            } else {
                student++;
                readpage = arr[i];
            }

            if (student > k) return false;
        }

        return true;
    }
}