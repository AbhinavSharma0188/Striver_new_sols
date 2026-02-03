public class q42_Print1_to_N_using_recursion {
    public static void main(String[] args) {
        int n=5;
        UnderstandingRec(n);
    }
    public static void UnderstandingRec(int n){
        if(n==0){
            return;
        }
        UnderstandingRec(n-1);
        System.out.println(n);
    }
    
    
}
