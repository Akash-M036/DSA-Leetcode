class Solution {
    public int maxDepth(String s) {
        int ans =0;
        int depth =0;
        //Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch==')')
            {
                // while(!st.isEmpty() && st.peek()!='('){
                //     st.pop();
                // }
                // if(!st.isEmpty() && st.peek()=='('){
                //     depth--;
                //     st.pop();
                // }
               depth--;
            }
            else{
                if(ch =='('){
               // st.push(ch);
                depth++;
                }
                // else{
                //     st.push(ch);
                // }
                ans = Math.max(depth,ans);
            }
        }
        return ans;
    }
}