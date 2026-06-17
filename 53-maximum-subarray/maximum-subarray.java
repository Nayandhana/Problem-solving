class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cur=nums[0];
        int sum=nums[0];
        for(int i=1;i<n;i++){
            cur=Math.max(nums[i],cur+nums[i]);
            sum=Math.max(cur,sum);
        }
        return sum;
    }
}