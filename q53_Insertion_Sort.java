public class q53_Insertion_Sort {
    public static void main(String[] args) {
        int arr[]={2,3,2,1,4,2};
        InsertionSort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void InsertionSort(int arr[]){
        for(int i=1;i<=arr.length-1;i++){
            int picked=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>picked){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=picked;
        }
        
    }
    
}
