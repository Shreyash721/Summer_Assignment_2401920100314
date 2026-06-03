class Solution {
    public int maxArea(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int max = 0;

        while (i < j) {
            max = Math.max(max, Math.min(nums[i], nums[j]) * (j - i));

            if (nums[i] < nums[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}