class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long mx = 0, mn = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx) mx = nums[i];
            if(nums[i]<mn) mn = nums[i];
        }
        return (mx-mn)*1L*k;
    }
}