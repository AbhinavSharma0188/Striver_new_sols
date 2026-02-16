public class q74_MajorityElement {
    public static void main(String[] args) {
        int arr[]={2,2,1,3,1,2,2};
        int majority=arr[0];
        int votes=1;
        for(int i=1;i<=arr.length-1;i++){
            if(votes==0){
                votes++;
                majority=arr[i];
            }
            else if(majority==arr[i]){
                votes++;
            }
            else{
                votes--;
            }
        }
        System.out.println(majority);
    }
    
}
