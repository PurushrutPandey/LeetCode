class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        String s = String.valueOf(n);
      
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0') {
                sb.append(s.charAt(i));
                sum += Character.getNumericValue(s.charAt(i));
            }
        }
        if(sb.length() == 0){
            return 0;
        }
        int x = Integer.parseInt(sb.toString());
        long y = (long) x*sum;
        return y;
    }
}