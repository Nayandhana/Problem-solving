class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> m=new HashMap<>();
        int count=0;
        for(int task:tasks){
            m.put(task,m.getOrDefault(task,0)+1);
        }
        for(Integer num:m.values()){
            if(num<2) return -1;
            else {
                int rem=(num+2)/3;
                count+=rem;
            }
        }
        return count;
    }
}