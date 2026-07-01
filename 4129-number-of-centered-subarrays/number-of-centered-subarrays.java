class Solution {
    public int centeredSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> s=new HashSet<>();
            int sum=0;
            for(int j=i;j<nums.length;j++){
                s.add(nums[j]);
                sum+=nums[j];
                if(s.contains(sum)) count++;
            }
        }
        return count;
    }
}