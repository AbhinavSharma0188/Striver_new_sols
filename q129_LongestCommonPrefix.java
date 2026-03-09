public class q129_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<=first.length-1;i++){
            if(first[i]==last[i]){
                ans.append(first[i]);
            }
            else{
                break;
            }
        }
        System.out.println(ans);

        

        
    }
    
}
