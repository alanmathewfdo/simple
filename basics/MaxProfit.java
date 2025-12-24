public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {3,8,2,6,8,9,5};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] day){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int curPrice = 0; curPrice < day.length; curPrice++){
            if(day[curPrice] < minPrice){
                minPrice = day[curPrice];
            }else{
                int profit = day[curPrice] - minPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
