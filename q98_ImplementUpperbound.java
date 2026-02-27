public class q98_ImplementUpperbound {
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5,7};
        int x=4;

        int si=0;
        int ei=arr.length-1;
        int ans=arr.length;

        while(si<=ei){
            int mid = si + (ei - si)/2;

            if(arr[mid] > x){
                ans = mid;
                ei = mid - 1;
            }
            else{
                si = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
