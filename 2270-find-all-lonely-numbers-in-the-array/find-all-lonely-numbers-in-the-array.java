class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> s = new ArrayList<>();
        if (nums.length == 1) {
            s.add(nums[0]);
            return s;
        }
        for (int i = 0; i < nums.length; i++) {
            int isInvalid = 0; 
            if (i > 0) {
                int leftDiff = nums[i] - nums[i - 1];
                if (leftDiff == 0 || leftDiff == 1) {
                    isInvalid = 1;
                }
            }
            if (i < nums.length - 1) {
                int rightDiff = nums[i + 1] - nums[i];
                if (rightDiff == 0 || rightDiff == 1) {
                    isInvalid = 1;
                }
            }
            if (isInvalid == 0) {
                s.add(nums[i]);
            }
        }
        return s;
    }
}
