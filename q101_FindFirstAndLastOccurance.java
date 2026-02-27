public class q101_FindFirstAndLastOccurance {
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        int left=first(arr,target);
        int right=second(arr,target);
        
        System.out.println(left);
        System.out.println(right);
     
        
        
        
    }
    public static int first(int arr[],int target){
        int si=0;int ei=arr.length-1;
        int index=-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==target){
                index=mid;
                ei=mid-1;

            }
            else if(arr[mid]<target){
                si=mid+1;

            }
            else{
                ei=mid-1;
            }
        }
        return index;
    }
    public static int second(int arr[],int target){
        int si=0;
        int ei=arr.length-1;
        int index=-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==target){
                index=mid;
                si=mid+1;

            }
            else if(arr[mid]<target){
                si=mid+1;

            }
            else{
                ei=mid-1;
            }


        }
        return index;
    }
    
}
