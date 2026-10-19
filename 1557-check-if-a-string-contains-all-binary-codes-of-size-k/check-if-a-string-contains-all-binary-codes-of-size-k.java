class Solution {
    /*
        000
        001
        010
        011
        100
        101
        110
        111
    */
    public boolean hasAllCodes(String s, int k) {
        int total = 1 << k;
    if (s.length()-k+1<total) return false;
    boolean[] seen = new boolean[total];
    int count = 0;
    int hash = 0;
    int mask = total - 1;
    for (int i = 0; i < k; i++) {
        hash =(hash << 1)|(s.charAt(i)-'0');
    }
    seen[hash] = true;
    count++;
    for (int i=k; i<s.length(); i++) {
        hash=((hash<<1)|(s.charAt(i)-'0'))&mask;
        if (!seen[hash]) {
            seen[hash] = true;
            count++;
            if (count==total) 
                return true;
        }
    }

    return count == total;
    }
}