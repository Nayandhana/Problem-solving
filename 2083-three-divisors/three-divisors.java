class Solution {
    public boolean isThree(int n) {
        int m=n-1;
        int dis=2;
        for(int i=2;i<m;i++){
            if(n%i==0){
                dis++;
            }
        }
        if(dis==3)
            return true;
        else return false;
    }
}