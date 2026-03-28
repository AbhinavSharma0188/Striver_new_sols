import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l1=new ArrayList<>();
        generate(0,0,"",n,l1);
        return l1;
        
    }
    public static void generate(int open,int close,String ans,int n,List<String> l1){
        if(open==n&&close==n){
        l1.add(ans);
        }
        if(open<n){
            generate(open+1, close, ans+"(", n,l1);
        }
        if(close<open){
            generate(open, close+1, ans+")", n,l1);
        }
    }
}