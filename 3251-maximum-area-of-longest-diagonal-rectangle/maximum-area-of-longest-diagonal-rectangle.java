class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max_ind = -1.0;
        int res = 0;
        for (int []rect : dimensions){
            int l = rect[0], b=rect[1];
            double d = Math.sqrt((double)l*l+(double)b*b);

            if (d>max_ind){
                max_ind=d;
                res = l*b;
            } else if (d==max_ind){
                res = Math.max(res, l*b);
            }
        }
        return res;
    }
}