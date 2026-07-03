class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            int row=map.getOrDefault(num,0);
        if(row==l.size()){
         l.add(new ArrayList<>());
        }
         l.get(row).add(num);
        map.put(num,row+1);
        }
        return l;
    }
}