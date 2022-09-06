public class _36_BuyAndSellStock1 {

//    This Question is done by Kadane's Algorithm

    public static void main(String[] args) {

       int[] prices={7,1,5,3,6,4};

       int maxProfit=Integer.MIN_VALUE;
       int minsofar=prices[0];

       for(int i=1;i<prices.length;i++){

           minsofar=Math.min(minsofar,prices[i]);

           maxProfit=Math.max(maxProfit,prices[i]-minsofar);
       }

        System.out.println(maxProfit);


    }



}
