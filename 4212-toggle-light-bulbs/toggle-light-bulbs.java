class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> list=new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for(int num : bulbs){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()%2!=0){
                list.add(e.getKey());
            }
        }
        
        return list;
    }
}