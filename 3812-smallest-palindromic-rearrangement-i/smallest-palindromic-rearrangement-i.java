class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (sb.length() == n / 2) {
                break;
            }
            int targetcount = freq[i] / 2;
            while (targetcount > 0) {
                if (sb.length() == n / 2) {
                    break;
                }
                sb.append((char) (i + 'a'));
                freq[i]--;
                targetcount--;
            }
        }
        Arrays.fill(freq, 0);
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        String firsthalf = sb.toString();
        String mid = "";
        if (n % 2 != 0) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 != 0) {
                    mid = String.valueOf((char) (i + 'a'));
                    break;
                }
            }
        }
        String secondhalf = sb.reverse().toString();
        return firsthalf + mid + secondhalf;
    }
}
