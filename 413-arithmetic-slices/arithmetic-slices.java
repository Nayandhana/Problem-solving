class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count=0;
        if(nums.length<2) return count;
        for(int i=0;i<nums.length-2;i++){
            int a=nums[i+1]-nums[i];
            for(int j=i+2;j<nums.length;j++){
             int b=nums[j]-nums[j-1];
             if(a==b) count++;
             else break;
            }
        }
        return count;
    }
}