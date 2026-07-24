class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            boolean a=false;
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
            if(nums[i]==nums[j]){
                a=true;
                break;
            }   
        }
        if(!a) sum+=nums[i];
        }
        return sum;
    }
}