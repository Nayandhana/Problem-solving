class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int[] a:matrix){
            for(int b:a){
                list.add(b);
            }
        } 
        Collections.sort(list);
        return list.get(k-1);
    }
}