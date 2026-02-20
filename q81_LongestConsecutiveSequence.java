import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class q81_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[]={0,3,7,2,5,8,4,6,0,1};
      System.out.println(  longest(arr));
       

    }
    public static int longest(int arr[]){
         HashSet<Integer> set=new HashSet<>();
        for(int num:arr) set.add(num);

        int longest=0;

        for(int num:set){
            if(!set.contains(num-1)){   // start of sequence
                int curr=num;
                int count=1;

                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }

                longest=Math.max(longest,count);
            }
        }
        return longest; 
    }
}
