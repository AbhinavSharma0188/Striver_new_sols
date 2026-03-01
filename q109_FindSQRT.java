public class q109_FindSQRT {
    public static int main(String[] args) {
        int x=8;
        int si=1;
        int ei=x;
        int ans=0;


        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(mid==x/mid){
                return mid;
            }
            else if(mid<x/mid){
                ans=mid;
          si=mid+1;

            }
            else{
             si=mid-1;
            }
            
        }
        return ans;
        
    }
    
}
