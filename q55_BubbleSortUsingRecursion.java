public class q55_BubbleSortUsingRecursion {

    public static void main(String[] args) {
        int arr[]={1,5,2,3,0};
        bubb(arr,5);
        for(int val:arr){
            System.out.print(val+ " ");
        }
    }
    public static void bubb(int arr[],int n){
        if(n==1){
            return;
        }
        for(int i=0;i<=arr.length-2;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubb(arr, n-1);
    }
}