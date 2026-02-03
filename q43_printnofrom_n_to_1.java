public class q43_printnofrom_n_to_1 {
    public static void main(String[] args) {
        int n=5;
        UnderstandingRec(n);
    }
    public static void UnderstandingRec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        UnderstandingRec(n-1);
        
    }
    
}
