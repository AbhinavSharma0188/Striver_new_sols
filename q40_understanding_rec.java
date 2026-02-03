public class q40_understanding_rec {
    public static void main(String[] args) {
        int n=5;
        UnderstandingRec(n);
    }
    public static void UnderstandingRec(int n){
        if(n==0){
            return;
        }
        System.out.println("hi");
        UnderstandingRec(n-1);
    }

    
}