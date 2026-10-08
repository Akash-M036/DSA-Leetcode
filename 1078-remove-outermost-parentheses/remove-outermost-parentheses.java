class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(st.size()==0 && ch=='('){
                st.push(ch);
                continue;
            }
            if(st.size()==1 && ch==')')
            {
                st.pop();
                continue;
            }
            sb.append(ch);
            if(ch=='(') 
                st.push(ch);
            if(!st.isEmpty() && ch==')')
                st.pop();

        }
        return sb.toString();
    }
}