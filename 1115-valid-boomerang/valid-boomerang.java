class Solution {
    public boolean isBoomerang(int[][] points) {
        int a=points[0][0];
        int b=points[0][1];
        int c=points[1][0];
        int d=points[1][1];
        int e=points[2][0];
        int f=points[2][1];
        if(a==c && b==d || a==e && b==f || e==c && f==d )
        return false;
        if((d-b)*(e-a)==(f-b)*(c-a))
        return false;
        return true;
    }
}