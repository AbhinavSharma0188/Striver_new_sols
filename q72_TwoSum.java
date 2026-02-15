import java.util.HashMap;

public class q72_TwoSum {
    public static void main(String[] args) {

        int arr[]={16,4,23,8,15,42,1,2};
        int target=19;

        int result[] = twoSum(arr,target);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] twoSum(int arr[],int target){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int complement=target-arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(arr[i],i);
        }

        return new int[]{};
    }
}
