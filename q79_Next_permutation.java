public class q79_Next_permutation {
    public static void main(String[] args) {
        int arr[]={1,3,2};
        int pivot=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i-1]<arr[i]){
                pivot=i-1;
                break;
            }
        }
         if (pivot == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }
        //find the no. exactly greater than pivot 
        for(int i=arr.length-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
            
        }
reverse(arr, pivot+1, arr.length-1);
for(int i=0;i<=arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println(arr[pivot]);
        
    }
    public static void reverse(int arr[],int st,int ei){
        while(st<ei){
            int temp=arr[st];
            arr[st]=arr[ei];
            arr[ei]=temp;
            ei--;
            st++;
        }
    }
    
}
