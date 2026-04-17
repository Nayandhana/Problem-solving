class Solution {
    public int largestAltitude(int[] gain) {
        int a=0;
        int b=0;
        for(int i=0;i<gain.length;i++){
            b+=gain[i];
            a=Math.max(a,b);
        }
        return a;
    }
}