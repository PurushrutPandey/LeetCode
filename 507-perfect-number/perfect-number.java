class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0, half = num/2;
        for(int i=1;i<=half;i++){
            if(num%i==0) sum+=i;
        }
        if(sum==num){
            return true;
        }
        else return false;
    }
}