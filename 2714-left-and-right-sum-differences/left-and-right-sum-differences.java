class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                rightSum[i] += nums[j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                leftSum[i] +=nums[j];
            }
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return res;
    }
}