class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k=k%total;
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
              row.add(0);
            }
            result.add(row);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int old1d=i*n+j;
                int new1d=(old1d+k)%total;
                int newrow=new1d/n;
                int newcol=new1d%n;
                result.get(newrow).set(newcol,grid[i][j]);
            }
        }
        return result;
    }
}