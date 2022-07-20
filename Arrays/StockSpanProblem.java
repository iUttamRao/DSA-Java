public class StockSpanProblem {
    public static void main(String[] args) {
        int prices[] ={1,5,3,8,12};
        int maxProfit=0;

        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                maxProfit =maxProfit+(prices[i+1]-prices[i]);
            }
        }
        System.out.println("Max Profit "+maxProfit);
    }
}
