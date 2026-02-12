public class q58_largestElementInAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,81,9};
        int maxVal=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        System.out.println(maxVal);
        
    }

    
}