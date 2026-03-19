class Solution 
{
    public void fun(List<List<Integer>>ans,List<Integer> temp,int[] candidates,int idx,int sum,int target)
    {
        if(idx==candidates.length)
        {
            if(sum==target)
            {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(sum>target) return;

        temp.add(candidates[idx]);
        fun(ans,temp,candidates,idx,sum+candidates[idx],target);

        temp.remove(temp.size()-1); 
        fun(ans,temp,candidates,idx+1,sum,target); 
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        fun(ans,temp,candidates,0,0,target);
        return ans;
    }
//please upvote if you find it helpful...
}