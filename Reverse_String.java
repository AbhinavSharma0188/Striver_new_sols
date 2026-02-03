public class Reverse_String {
    public static void main(String[] args) {
        String str="abhi";
        String rev="";
        int i=str.length()-1;
        Reverse(str,rev,i);
    }
    public static void Reverse(String str,String rev,int i){
        if(i<0){
     
            System.out.println(rev);
        return;
        }
        
        Reverse(str,rev+str.charAt(i),i-1);
       
    }
}
