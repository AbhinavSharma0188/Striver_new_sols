public class q46_reverse_a_number {
    public static void main(String[] args) {
        int n=12345;
        int rev=0;
    

        reverse(n,rev);
    }
    public static void reverse(int n,int rev){
        if(n==0){
            System.out.println(rev);
            return;
        }
        reverse(n/10,rev*10+n%10);
    }
    
}
