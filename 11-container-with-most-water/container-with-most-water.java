class Solution {
    public int maxArea(int[] height) {
        int max_amount = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            max_amount = Math.max(max_amount, (r - l) * Math.min(height[l], height[r]));

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max_amount;        
    }
}