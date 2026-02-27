public class q102_CountOccurance {

    static int firstOcc(int[] arr, int target){
        int si=0, ei=arr.length-1, ans=-1;

        while(si<=ei){
            int mid = si+(ei-si)/2;

            if(arr[mid]==target){
                ans = mid;
                ei = mid-1;   // move left
            }
            else if(arr[mid] < target){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
        return ans;
    }

    static int lastOcc(int[] arr, int target){
        int si=0, ei=arr.length-1, ans=-1;

        while(si<=ei){
            int mid = si+(ei-si)/2;

            if(arr[mid]==target){
                ans = mid;
                si = mid+1;   // move right
            }
            else if(arr[mid] < target){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int arr[]={1,2,2,2,3,4};
        int target=2;

        int first = firstOcc(arr,target);
        int last = lastOcc(arr,target);

        int count = (first==-1)?0:last-first+1;

        System.out.println(count);
    }
}