class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
            return false;
            int[] factors={2,3,5};
            for(int m:factors){
                while(n%m==0){
                    n/=m;
                }
            }
            return n==1;
        
    }
}