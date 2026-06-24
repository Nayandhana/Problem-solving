class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count=1;
        int s=nums[0];
        for(int i=1;i<nums.length;i++){
          if(s<=nums[i]){
            
            count++;
            s = nums[i];
          }
        }
        return count;
    }
}