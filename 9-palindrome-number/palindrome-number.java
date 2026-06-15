class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String v = new StringBuilder(s).reverse().toString();
        if(s.equals(v)) return true;
        else return false;
    }
}