public class q62_RotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
       for(int a=0;a<=arr.length-1;a++){
        System.out.print(arr[a]+" ");
       }
    }


    
}