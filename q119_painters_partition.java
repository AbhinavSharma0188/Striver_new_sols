class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int low=0;
        int high=0;
        int ans=0;
        if(k>arr.length) {
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
            low=mid+1;
            
        }
        return ans;
        
    }
    public static boolean isItpossible(int arr[],int mid,int k){
        int pcount=1;
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
        if(arr[i]+count<=mid){
                count+=arr[i];
        }
        else{
            pcount++;
            count=arr[i];
        }
        if(pcount>k){
            return false;
        }
        }
        return true;;
    }
}
