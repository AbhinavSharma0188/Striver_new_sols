public class q60_CheckIfAnArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={4,2,5,2,5};
        System.out.println(sort(arr));
       

        }
    public static boolean sort(int arr[]){
         for(int i=0;i<=arr.length-2;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
            
    }
return true;}
    
}
