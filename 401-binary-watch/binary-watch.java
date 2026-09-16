class Solution {
    Set<String> set = new HashSet<>();
    public void min(int val,int cnt,int start){
       if(cnt==0){
            int toadd = 0b1111000000;
            int hrs = (toadd & val)>>6;
            int minutes = 0b0000111111 & val;
            if (hrs< 12 && minutes< 60) {
                set.add(hrs + ":" + (minutes < 10 ? "0" + minutes : minutes));
            }
            return;
        }
        for(int i =start; i<10;i++){
            min(val | (1<<i),cnt-1,i+1);
        }
        return ;
    }
    public List<String> readBinaryWatch(int turnedOn) {
        if(turnedOn==0)
        {
            List<String> ans = new ArrayList<>();
            ans.add("0:00");
            return ans;
        } 
        if(turnedOn>=9)
        return new ArrayList<>();
        min(0,turnedOn,0);
        List<String> ans = new ArrayList<>();
        for(String s  : set){
            ans.add(s);
        }
        //Collections.sort(ans);
        return ans;
    }
}
