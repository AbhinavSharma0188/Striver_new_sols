import java.util.ArrayList;
import java.util.Collections;

public class q80_LeadersInAnArray {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
        int leader=arr[arr.length-1];
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(leader);
        int max=leader;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                leader=arr[i];
                max=arr[i];
                l1.add(leader);

            }

        }
        Collections.reverse(l1);
        System.out.println(l1);
    }
    
}
