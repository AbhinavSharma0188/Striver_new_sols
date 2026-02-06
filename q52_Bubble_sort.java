public class q52_Bubble_sort {
    public static void main(String[] args) {
        int arr[]={2,3,2,1,4,2};
        Bubble_Sort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Bubble_Sort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-i-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    
}
