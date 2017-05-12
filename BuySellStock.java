public class BuySellStock{
    public int maxProfit(int [] prices){
        int buy, sell, profi, preProfi;
        if(prices.length<=0) return 0;
        buy=prices[0];
        sell=prices[0];
        profi=preProfi=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]-buy > profi){
                sell = prices[i];
                profi = prices[i]-buy;
            }
            if(prices[i]-buy<0){
                if(profi>preProfi){
                    preProfi=profi;
                }
                buy = prices[i];
                sell = prices[i];
                profi = 0;
            }
        }
        if(profi>preProfi){
            return profi;
        }
        else
            return preProfi;
    }
}