public class q65_Linear_Search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=5;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==target)
            {
                System.out.println(i);
            }
        }
        
    }
    
}
