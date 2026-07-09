class Solution {
    public int totalSteps(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int count=0;
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&nums[i]>nums[s.peek()]){
                int pop=s.pop();
                dp[i]=Math.max(dp[i]+1,dp[pop]);
            }
            s.push(i);
            count=Math.max(count,dp[i]);
        }
        return count;
    }
}