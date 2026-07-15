class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int z = 0; 
        for (int i = 0; i < arr.length && z < arr.length; i++) {
            if (arr[i] == 0) {
                res[z] = 0; 
                z++;
                
                if (z < arr.length) {
                    res[z] = 0; 
                    z++;
                }
            } else {
                res[z] = arr[i]; 
                z++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }
}
