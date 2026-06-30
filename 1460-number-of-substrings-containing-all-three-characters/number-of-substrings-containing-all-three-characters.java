class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int left =0;
        int right =0;
        int ans =0;
        int n =s.length();
       for(right=0; right< n; right++ ){
             int curr = s.charAt(right)-'a';
                count[curr]++;
            while((count[0]>0 && count[1]>0  && count[2]>0)  ){                
                    ans+=(n-right);
                    count[s.charAt(left)-'a']--;
                    left++; 
            }
            // right--;left++;
        }
        return ans;
    }
}