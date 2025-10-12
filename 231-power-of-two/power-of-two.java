class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<31;i++){
        int m=(int) Math.pow(2,i);
        if(n==m){
            return true;
        }
        }
        
            return false;
       
    }
}