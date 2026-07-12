class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=(n-1)/2;
        int[] r=new int[n];
        int left=mid;
        int right=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                r[i]=nums[left--];
            }
            else{
                r[i]=nums[right--];
            }
        }
        System.arraycopy(r,0,nums,0,n);
    }
}