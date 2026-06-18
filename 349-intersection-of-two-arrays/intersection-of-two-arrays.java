class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        int l=nums1.length;
        int m=nums2.length;
        //int[] a=new int[l];
        //int[] b=new int[m];
        for(int i=0;i<l;i++){
            for(int j=0;j<m;j++){
        if(nums1[i]==nums2[j]){
         if(!arr.contains(nums1[i])){
            arr.add(nums1[i]);
         }
        }
        }
        }
        
        int[] result = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            result[k] = arr.get(k);
        }
        
        return result;
    }
}