public class q112_MinumumnoofdaystoMakeBoquets {

    public static void main(String[] args) {

        int arr[] = {1,10,3,10,2};
        int m = 3;
        int k = 1;

        int ei = 0;
        int result = -1;

        // find max element
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ei){
                ei = arr[i];
            }
        }

        int si = 1;

        while(si <= ei){
            int mid = si + (ei - si)/2;

            if(isPossible(arr, mid, m, k) >= m){
                result = mid;
                ei = mid - 1;
            }
            else{
                si = mid + 1;
            }
        }

        System.out.println(result);
    }

    public static int isPossible(int arr[], int mid, int m, int k){

        int bloomcount = 0;
        int conscount = 0;

        for(int i = 0; i < arr.length; i++){

            if(mid >= arr[i]){
                conscount++;
            }
            else{
                conscount = 0;
            }

            if(conscount == k){
                bloomcount++;
                conscount = 0;
            }
        }

        return bloomcount;  // ✅ correct position
    }
}