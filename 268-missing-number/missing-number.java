class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                res = i;
                break;
            }
            else {
                res = n;
            }
        }
        return res;
    }
}