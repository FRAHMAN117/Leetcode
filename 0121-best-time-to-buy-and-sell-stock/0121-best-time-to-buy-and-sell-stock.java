class Solution {
    public int maxProfit(int[] prices) {
       int left= 0;
       int right= 1;
       int maxvalue=0;
       int temp=0;
       int i=0;

       while (i< prices.length-1) {
            if (prices[left]> prices[right]){
                left= right;
            }
            temp= prices[right]-prices[left];
            if (temp>maxvalue){
                maxvalue= temp;
            }
            right++;
            i++;
       }
       return maxvalue;
    }
}