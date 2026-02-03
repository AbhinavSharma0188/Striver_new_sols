public class q41_printing_name_ntimes {
    public static void main(String[] args) {
        int n=4;
        UnderstandingRec(n);
    }
    public static void UnderstandingRec(int n){
        if(n==0){
            return;
        }
        System.out.println("Abhinav");
        UnderstandingRec(n-1);
    }
    
}
