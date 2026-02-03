public class q45_factorial_of_a_number {
    public static void main(String[] args) {
        int i=5;
       System.out.println( fact(i));
    }
    public static int fact(int i){
        if(i==0){
            return 1;
        }
        return fact(i-1)*i;

    }
    
}
