class Solution {
    public int minAddToMakeValid(String s) {
        int cnt =0;
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch==')'){
                if(!st.isEmpty() && st.peek()!=')')
                    st.pop();
                
                else
                    cnt++;
            }
            else{
                st.push(ch);
            }
           
        }
        return st.size()+cnt;
    }
}