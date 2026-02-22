class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int tot =0;
        for (int longest =nums.length-1; longest>=2;longest--){
            int l=0;
            int r = longest-1;
            while (l<r){
                if(nums[l]+nums[r]>nums[longest]){
                    tot += (r-l);
                    r--;
                } else {
                    l++;
                }
            }
        }
        return tot;
    }
}