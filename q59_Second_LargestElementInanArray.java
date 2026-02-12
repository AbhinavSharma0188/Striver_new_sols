public class q59_Second_LargestElementInanArray {
    public static void main(String[] args) {
        int arr[]={4,3,2};
        int maxVal=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>maxVal){
                secondLargest=maxVal;
                maxVal=arr[i];
            }
            else if(arr[i]>secondLargest&&arr[i]!=maxVal){
                secondLargest=arr[i];
            }
        }

        System.out.println(secondLargest);
        
    }
    
}
