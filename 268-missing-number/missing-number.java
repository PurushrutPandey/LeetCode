class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                res = i;
                break;
            }
            else res = n;
        }
        return res;
    }
}