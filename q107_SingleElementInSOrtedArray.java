public class q107_SingleElementInSOrtedArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
        int si=0;
        int ei=arr.length-1;
        while(si<ei){
            int mid=si+(ei-si)/2;
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                    si=mid+2;

                }
                else{
                    ei=mid;

                }


            }
            if(mid%2!=0){
               if(arr[mid]==arr[mid-1]){
                si=mid+1;
               }
               else{
                ei=mid-1;
               }

              
            }
            
           

        }
        System.out.println(arr[si]);
    }
    
}
