class Solution {
    public boolean equalFrequency(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c-'a']++;
        }
        for (int i = 0; i<word.length();i++) {
            count[word.charAt(i)-'a']--;
            if (sameall(count)) {
                return true;
            }
            count[word.charAt(i)-'a']++;
        }

        return false;
    }
    private boolean sameall(int[] count) {
        int same = -1;
        for (int freq : count) {
            if (freq==0) continue;
            if (same==-1) {
                same=freq;
            } else if (freq!=same) {
                return false;
            }
        }
        return true;
    }
}
