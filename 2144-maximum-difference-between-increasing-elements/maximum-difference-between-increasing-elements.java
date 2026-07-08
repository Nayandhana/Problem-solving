class Solution {
    public int maximumDifference(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int a=-1;
        for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
            
            if(nums[i]<nums[j]){
                a=Math.max(a,nums[j]-nums[i]);
            }
           
          }
        }
        return a;
    }
}