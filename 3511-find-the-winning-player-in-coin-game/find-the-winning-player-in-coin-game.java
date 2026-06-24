class Solution {
    public String winningPlayer(int x, int y) {
        int a=Math.min(x,y/4);
        return (a%2==1) ?"Alice":"Bob";

    }
}