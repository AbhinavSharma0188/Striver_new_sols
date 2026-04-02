import java.util.*;
class Solution {
    static List<Integer> get(int a, int b) {
        
        List<Integer>l1=new ArrayList<>();
        a=a^b;
        b=a^b;
        a=a^b;
        l1.add(a);
        l1.add(b);
        return l1;
        
        
    }
}