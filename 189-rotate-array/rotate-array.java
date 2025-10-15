class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int s=k%n;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[(i+s)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
     
}

     
}