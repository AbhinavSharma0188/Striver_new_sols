public class q113_FindTheSmallerDivisorGivenATHreshhold {

    public static void main(String[] args) {

        int arr[] = {44, 22, 33, 11, 1};
        int threshold = 6;

        int si = 1;
        int ei = 0;
        int divisor = -1;

        // find max element
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ei){
                ei = arr[i];
            }
        }

        while(si <= ei){

            int mid = si + (ei - si) / 2;

            int sum = 0;  // ✅ reset here

            for(int i = 0; i < arr.length; i++){
                sum += (int)Math.ceil((double)arr[i] / mid);
            }

            // ✅ decision AFTER sum calculation
            if(sum <= threshold){
                divisor = mid;
                ei = mid - 1;   // try smaller divisor
            }
            else{
                si = mid + 1;   // need bigger divisor
            }
        }

        System.out.println(divisor);
    }
}