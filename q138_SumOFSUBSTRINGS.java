public class q138_SumOFSUBSTRINGS {
    public static void main(String[] args) {
        String s= "aabcb";
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i;j<=s.length()-1;j++){
                System.out.println(s.substring(i,j));
                
            }
           
        }
        
    }

    
}