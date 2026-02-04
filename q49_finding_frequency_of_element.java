import java.util.HashMap;
class Main{
  public static void main(String[] args) {
    int arr[]={15,16,27,27,28,15};
    HashMap <Integer,Integer>result=new HashMap<>();
    for(int i=0;i<=arr.length-1;i++){
      if(result.containsKey(arr[i])){
        result.put(arr[i],result.get(arr[i])+1);
      }
      else{
        result.put(arr[i], 1);
      }
    }
    System.out.println(result);


  }
}
