public class q100_FloorCeilinSOrtedarray {

    
 
    public static int[] getFloorAndCeil(int[] arr, int x) {
        int n = arr.length;

        int floor = -1;
        int ceil = -1;

        int si = 0;
        int ei = n - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == x) {
                floor = arr[mid];
                ceil = arr[mid];
                return new int[]{floor, ceil};
            }

            if (arr[mid] < x) {
                floor = arr[mid];   // possible floor
                si = mid + 1;
            } else {
                ceil = arr[mid];    // possible ceil
                ei = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }
}