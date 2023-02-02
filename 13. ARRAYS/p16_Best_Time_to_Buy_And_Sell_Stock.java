public class p16_Best_Time_to_Buy_And_Sell_Stock {
    
    public static int buyOrSellStock(int arr[]){

        int buyPrice = Integer.MAX_VALUE ;
        int maxProfit = 0 ; 

        for(int i = 0 ; arr.length > i ; i++){

            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice ;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = arr[i];
            }
        }
        return maxProfit ;
    }

    public static void main(String args []){

        int price[] = {7,1,5,3,6,4};

        int Stock = buyOrSellStock(price);

        System.out.println(Stock);
    }
}
