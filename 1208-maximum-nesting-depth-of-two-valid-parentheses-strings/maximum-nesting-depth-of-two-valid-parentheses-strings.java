class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        boolean one =true;
        int[] ans = new int[seq.length()];
        int i=0;
        for(char ch : seq.toCharArray()){
            if(ch=='('){
                if(one)
                    ans[i]=0;
                else
                    ans[i]=1;
                one = !one;
            }
            else
            {
                  one = !one;
                 if(one)
                    ans[i]=0;
                else
                    ans[i]=1;
            }
            i++;
        }
        return ans;
    }
}