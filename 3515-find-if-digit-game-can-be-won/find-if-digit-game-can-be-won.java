class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sums=0;
        for(int i=0;i<n;i++){
            if(nums[i]<=9){
               sum+=nums[i];
            } else{
                sums+=nums[i];
            }      
        }
        if(sum==sums){
            return false;
        }
        return true;
    }
}