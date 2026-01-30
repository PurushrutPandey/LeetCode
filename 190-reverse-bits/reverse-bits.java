class Solution {
    public int reverseBits(int n) {
        int reverseN = Integer.reverse(n);
        String bi_reversed = Integer.toBinaryString(reverseN);
        int reversed_number = Integer.parseInt(bi_reversed,2);
        return  reversed_number;
    }
}