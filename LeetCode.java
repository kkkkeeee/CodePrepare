
public class LeetCode{
    public static void main(String [] args){

//561 Array Partition I        
/*        int[] nums = {1,3,4,2};
        int result = 0;
        ArrayPartitionI arr = new ArrayPartitionI();
        result = arr.arrayPairSum(nums);
        System.out.println("The result is:"+ result);*/

//121 Best Time to Buy and Sell Stocks
/*        //int [] prices = {7,1,5,3,6,4};
        //int [] prices = {7,6,4,3,1};
        int [] prices = {7,1,7,0,3,4};
        int result =0;
        BuySellStock buy = new BuySellStock();
        result = buy.maxProfit(prices);
        System.out.println("The result is:"+ result);    */

//1. Two Sum
        int [] prices = {2,7,11,15};
        int []result =new int[2];
        TwoSum buy = new TwoSum();
        result = buy.twoSum(prices, 13);
        System.out.println("The result is:"+ result[0] + " "+result[1]);
    }
}