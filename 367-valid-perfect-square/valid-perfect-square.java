class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int half = num/2;
        for(int i=0;i<=half;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}