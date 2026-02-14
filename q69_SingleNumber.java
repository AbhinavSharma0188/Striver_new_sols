import java.util.HashMap;

public class q69_SingleNumber {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = {2,2,1};

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.remove(arr[i]);
            } else {
                map.put(arr[i], i);
            }
        }

        // Print only the single number (not in array format)
        for(int key : map.keySet()){
            System.out.println(key);
        }
    }
}
