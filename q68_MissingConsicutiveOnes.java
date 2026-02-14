public class q68_MissingConsicutiveOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        int cons=0;
        int maxCons=0;
        for(int i=0;i<=arr.length-1;i++){
            
            if(arr[i]!=1){
                cons=0;
            }
            else{
                cons=cons+1;
            }
            if(cons>maxCons){
                maxCons=cons;
            }



        }
        System.out.println(maxCons);
    }
    
}
