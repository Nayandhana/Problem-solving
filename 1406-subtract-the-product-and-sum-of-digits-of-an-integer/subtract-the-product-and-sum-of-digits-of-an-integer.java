class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        int d;
        while(n>0){
            d=n%10;
            p*=d;
            s+=d;
            n/=10;
           
        }
        return p-s;
    }
}