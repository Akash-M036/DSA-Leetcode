class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xclose = Math.max(x1, Math.min(x2, xCenter));
        int yclose = Math.max(y1, Math.min(y2, yCenter));
        int xval = xCenter - xclose;
        int yval = yCenter - yclose;    
        int sqdist = (xval * xval) + (yval * yval);
        return sqdist <= (radius * radius);
    }
}
