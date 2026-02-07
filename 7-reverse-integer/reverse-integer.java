class Solution {
    public int reverse(int x) {
        int a = x >= 0 ? x : -x;
        double res = 0;

        while(a > 0) {
            res = res * 10 + (a % 10);

            a /= 10; 
        }

        if(res > Integer.MAX_VALUE)
            return 0;

        return x >= 0 ? (int)res : (int)-res;
    }
}