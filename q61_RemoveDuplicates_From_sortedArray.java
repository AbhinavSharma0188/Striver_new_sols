public class q61_RemoveDuplicates_From_sortedArray {
    public static void main(String[] args) {
        int arr[]={1,1,2};
        int j=0;
        for(int i=1;i<=arr.length-1;i++){
            if(arr[j]!=arr[i]){
                j=j+1;
                arr[j]=arr[i];
            }
           
            
        }
         System.out.print(j+1);

    }
    
}
