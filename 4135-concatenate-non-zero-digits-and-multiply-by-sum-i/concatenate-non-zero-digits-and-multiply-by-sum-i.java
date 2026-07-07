class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long rem=0;
        long a=1;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
           sum+=digit;
           rem+=digit*a;
           a*=10;
           
            }
            n/=10;
        }
        
        return rem*sum;
    }
}