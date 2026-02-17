public class q77_buyandSellStocks {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
         int buyPrice=arr[0];
        int profit=0;
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]<buyPrice){
                buyPrice=arr[i];
            }
            else{
                int currentProfit=arr[i]-buyPrice;
                profit=Math.max(profit,currentProfit);
            }
        }
       System.out.println(profit);
    }
    
    
}
