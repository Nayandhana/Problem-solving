class Solution {
    public int xorOperation(int n, int start) {
        int nums=n;
        
        int xor=0;
        for(int i=0;i<nums;i++){
            xor^=start+2*i;
            
        }
        return xor;
    }
}