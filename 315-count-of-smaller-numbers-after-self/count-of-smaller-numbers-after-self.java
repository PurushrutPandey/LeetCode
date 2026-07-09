class Solution {
    int[] ans;
    int[] index;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        ans = new int[n];
        index = new int[n];

        for (int i = 0; i < n; i++)
            index[i] = i;

        mergeSort(nums, 0, n - 1);

        List<Integer> res = new ArrayList<>();
        for (int x : ans)
            res.add(x);

        return res;
    }

    private void mergeSort(int[] nums, int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;

        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, mid, r);
    }

    private void merge(int[] nums, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];

        int i = l;
        int j = mid + 1;
        int k = 0;

        int rightCount = 0;

        while (i <= mid && j <= r) {
            if (nums[index[j]] < nums[index[i]]) {
                temp[k++] = index[j++];
                rightCount++;
            } else {
                ans[index[i]] += rightCount;
                temp[k++] = index[i++];
            }
        }

        while (i <= mid) {
            ans[index[i]] += rightCount;
            temp[k++] = index[i++];
        }

        while (j <= r) {
            temp[k++] = index[j++];
        }

        for (int x = 0; x < temp.length; x++)
            index[l + x] = temp[x];
    }
}