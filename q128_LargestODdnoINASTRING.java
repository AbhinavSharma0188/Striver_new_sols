public class q128_LargestODdnoINASTRING {
    public static void main(String[] args) {
        String str="35427";
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            int parseOne=str.charAt(i)-'0';
            if(parseOne%2!=0){
                ans+=str.substring(0,i+1);
                break;
               
              
            }
            

        }
        System.out.println(ans);
        
    }
    
}
