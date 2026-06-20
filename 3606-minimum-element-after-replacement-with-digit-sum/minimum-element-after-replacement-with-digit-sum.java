class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        
        int a=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           int c=nums[i];
            int d=0;
            while(c>0){
                d+=c%10;
                c/=10;
            }

        
           a=Math.min(a,d); 
        }
        

       return a; 
    }
}