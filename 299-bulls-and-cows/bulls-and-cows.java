class Solution {
    public String getHint(String secret, String guess) {
        int i =0;
        int bulls=0;
        int cows =0;
       int[] freq = new int[10];
        while(i<secret.length()){
            if(secret.charAt(i)==guess.charAt(i)){
                i++;
                bulls++;
            }
            else{
                freq[secret.charAt(i)-'0']++;
                i++;
            }
        }
        i =0;
        while(i<secret.length()){
            if(secret.charAt(i)==guess.charAt(i)){
                i++;
                continue;
            }
            else{
                if(freq[guess.charAt(i)-'0']>0){
                    freq[guess.charAt(i)-'0']--;
                    cows++;
                }
                i++;
            }
        }
        guess = bulls+"A"+cows+"B";
        return guess;
    }
}