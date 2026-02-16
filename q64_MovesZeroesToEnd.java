

public class q64_MovesZeroesToEnd {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,2,0,2,0,2,0};
        int j=0;
        int result[]=new int[arr.length];
    
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                result[j]=arr[i];
                j++;
            }

            
           
        }
        while(j<=arr.length-1){
            result[j]=0;
            j++;
        }
        for(int a=0;a<=result.length-1;a++){
            System.out.print(result[a]+" ");
        }

       
        
    }
    
}
