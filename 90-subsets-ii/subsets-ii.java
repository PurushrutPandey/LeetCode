class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        int cache = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {

            List<List<Integer>> newRes = new ArrayList<>();

            // If duplicate element
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = cache;
            } else {
                start = 0;
            }

            cache = res.size();

            for (int j = start; j < res.size(); j++) {

                List<Integer> temp = new ArrayList<>(res.get(j));

                temp.add(nums[i]);

                newRes.add(temp);
            }

            res.addAll(newRes);
        }

        return res;
    }
}