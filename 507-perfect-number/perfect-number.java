class Solution {
    public boolean checkPerfectNumber(int num) {
        int a=0;
        int temp=num;
        for(int i=1;i<=num/2;i++){
            if(num%i==0) a+=i;
        }
        return (a==temp);
    }
}