class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
            int a=(nums[i]-1)*(nums[j]-1);
            a=Math.max(a,max);
            if(a>max){
                max=a;
            }
        }
        
    }
    return max;
}
}