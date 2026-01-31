class Solution {
    public int findClosest(int x, int y, int z) {
        int distY = Math.abs(z-y);
        int distX = Math.abs(z-x);
        if(distX==distY){
            return 0;
        }
        else{
            return distX < distY ? 1 : 2;
        }
    }
}