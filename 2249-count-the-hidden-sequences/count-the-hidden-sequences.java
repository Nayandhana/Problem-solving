class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int s=0;
        int a=0;
        int b=0;
        for(int i=0;i<differences.length;i++){
            s+=differences[i];
            a=Math.min(s,a);
            b=Math.max(s,b);
            if(b-a>upper-lower) return 0;
        }
        return (upper-lower)-(b-a)+1;
    }
}