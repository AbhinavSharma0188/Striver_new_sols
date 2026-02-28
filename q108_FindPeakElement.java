public class q108_FindPeakElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int si=0;
        int ei=arr.length-1;
        while(si<ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]<arr[mid+1]){
                si=mid+1;
            }
            else{
                ei=mid;
            }
        }
        System.out.println(si);
    }
    
}
