class Solution {
    public int minimumPushes(String word) {
       int[] freq = new int[26];
       for(char ch : word.toCharArray()){
        freq[ch-'a']++;
       } 
      int dchar =0;
      int sum =0;
       Arrays.sort(freq);
       for(int i = 25; i >=0;i--){
         dchar++;
            while(freq[i]!=0){
                if(dchar<=8){
                    sum += 1;
                }
                else if(dchar<=16){
                    sum += 2;
                }
                else if(dchar<=24){
                    sum += 3;
                }
                else{
                    sum+=4;
                }
                freq[i]--;
            }
           
       }
       return sum;
    }
}