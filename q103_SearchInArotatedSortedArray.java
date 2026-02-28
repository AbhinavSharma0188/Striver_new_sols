public class q103_SearchInArotatedSortedArray {

    public static void main(String[] args) {
        int arr[]={6,7,8,1,2,3,4,5};
        int si=0;
        int ei=arr.length-1;
        int target=4;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==target){
               System.out.println(mid);
            }
            //left sorted means
            if(arr[si]<=arr[mid]){
                if(target>=arr[si]&&target<arr[mid]){
                    ei=mid-1;
                }
                else{
                    si=mid+1;
                }


            }

            else{
                if(arr[mid]<target&&target<=arr[ei]){
                    si=mid+1;
                }
                else {
                    ei = mid - 1;
                }
            }
        }
        
        
    }
}