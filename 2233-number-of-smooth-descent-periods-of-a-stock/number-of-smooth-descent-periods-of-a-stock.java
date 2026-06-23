class Solution {
    public long getDescentPeriods(int[] prices) {
        long a= 0, l = 0;
        for(int i=0;i<prices.length;i++){
            if(i>0 && prices[i]+1!=prices[i-1])l=i;
            a+=i-l+1;
        }
        return a;
    }
}