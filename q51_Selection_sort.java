public class q51_Selection_sort {
    public static void main(String[] args) {
        int arr[]={2,3,2,1,4,2};
        Selection_Sort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Selection_Sort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<=arr.length-1;j++){
              if(arr[j]<arr[minIndex]){
                minIndex=j;
              

              }


            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    
}
