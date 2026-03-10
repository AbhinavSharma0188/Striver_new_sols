class Solution {
    public int maxDepth(String str) {
        int openBracket=0;
        int ans=0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='('){
                openBracket+=1;
            }
            else if(str.charAt(i)==')'){
                openBracket-=1;

            }
            if(openBracket>ans){
                ans=openBracket;
            }

        }
        return ans;
        
    }
}