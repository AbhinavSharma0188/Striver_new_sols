public class q44_sum_of_n_numbers {

    public static void main(String[] args) {
        int n=5;
         int sum=0;
        UnderstandingRec(n,sum);
    }
    public static void UnderstandingRec(int n,int sum){
       
        if(n==0){
            System.out.println(sum);
            return;
        }
       
        UnderstandingRec(n-1,sum+n);
      
    }
}