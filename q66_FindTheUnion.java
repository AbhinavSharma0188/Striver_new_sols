import java.util.HashSet;

public class q66_FindTheUnion {

    public static void main(String[] args) {
       int arr1[]= {1,2,2,3};
int arr2[] = {2,3,4};

        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<=arr1.length-1;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<=arr2.length-1;j++){
            if(set.contains(arr2[j])){
                continue;

            }
            else{
                set.add(arr2[j]);
            }
        }
     
       

System.out.println(set);
    }

    
}
