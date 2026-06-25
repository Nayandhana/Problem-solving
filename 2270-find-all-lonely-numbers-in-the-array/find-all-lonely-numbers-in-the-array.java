class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> s = new ArrayList<>();
        if (nums.length == 1) {
            s.add(nums[0]);
            return s;
        }
        for (int i = 0; i < nums.length; i++) {
            int a = 0; 
            if (i > 0) {
                int b = nums[i] - nums[i - 1];
                if (b== 0 ||b == 1) {
                    a = 1;
                }
            }
            if (i < nums.length - 1) {
                int c = nums[i + 1] - nums[i];
                if (c == 0 || c == 1) {
                    a = 1;
                }
            }
            if (a == 0) {
                s.add(nums[i]);
            }
        }
        return s;
    }
}
