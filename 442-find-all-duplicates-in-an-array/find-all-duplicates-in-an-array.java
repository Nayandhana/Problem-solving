class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> m=new HashMap<>();
        for(int a:nums){
            m.put(a,m.getOrDefault(a,0)+1);

        } 
        List<Integer> map=new ArrayList<>();
        for(int b:m.keySet()){
            if(m.get(b)==2) map.add(b);
        }
        return map;
    }
}