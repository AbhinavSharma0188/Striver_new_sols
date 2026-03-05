class Solution {
    public int splitArray(int[] arr, int k) {
        int low=0;
        int high=0;
        int ans=0;
        if(k>arr.length){
            return -1;
        }
        for(int i=0;i<=arr.length-1;i++){
            low=Math.max(low,arr[i]);
            high=high+arr[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isItpossible(arr,mid,k)){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;


        
    }
    public static boolean isItpossible(int arr[],int mid,int k){
        int count=0;
        int kcount=1;
        for(int i=0;i<=arr.length-1;i++){
            if(count+arr[i]<=mid){
                count+=arr[i];

            }
            else{
                kcount++;
                count=arr[i];
            }
            if(kcount>k){
                return false;
            }
        }
        return true;
    }
}