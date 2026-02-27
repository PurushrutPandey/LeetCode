class Solution {
    public int firstMissingPositive(int[] nums) {
        int [] filtered = Arrays.stream(nums).filter(n->n>0).toArray();
        Arrays.sort(filtered);
        int target = 1;
        for (int n:filtered){
            if(n==target){
                target++;
            } else if (n>target){
                return target;
            }
        }
        return target;
    }
}