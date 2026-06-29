class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        if(nums.length<2) return 0;
        for(int i=1;i<nums.length;i++){
           int diff=nums[i]-nums[i-1];
           max=Math.max(max,diff);
           
        }
        return max;
    }
}