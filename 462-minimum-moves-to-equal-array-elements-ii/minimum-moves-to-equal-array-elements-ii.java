class Solution {
    public int minMoves2(int[] nums) {
         Arrays.sort(nums);
         int mid=(int)nums.length/2;
         int a=0;
         int med=nums[mid];
         for(int i=0;i<nums.length;i++){
             a+=Math.abs(nums[i]-med);
         }
         return a;
    }
}