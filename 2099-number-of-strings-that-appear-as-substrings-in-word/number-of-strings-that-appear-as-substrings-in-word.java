class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String ans : patterns){
            // if(word.length()<ans.length())
            //     continue;
            if(word.contains(ans)){
                count++;
            }
        }
        //returns total substrings in presents in pattern array string
        return count;
    }
}