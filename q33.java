// Count Digits 

class q33{
    public static void main(String[] args) {
        int n=12345;
        int count=0;

        while(n!=0){
             n=n/10;
            count=count+1;


        }
        System.out.println(count);
    }
}