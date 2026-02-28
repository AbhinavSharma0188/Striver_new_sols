public class q106_FindoutHOwmanytimesarrayisRotated {
    public static void main(String[] args) {
        int arr[]={15,18,2,3,6,12};
        int si=0;
        int ei=arr.length-1;
        while(si<ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]>arr[ei]){
                si=mid+1;

            }
            else{
                ei=mid;
            }
        }
        System.out.println(si);
        
    }
    
}
