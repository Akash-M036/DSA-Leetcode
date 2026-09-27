class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i< s.length();i++){
            if(s.charAt(i)!=')'){
                st.push(s.charAt(i));
            }
            else{
                while(!st.isEmpty() && st.peek()!='('){
                    q.add(st.pop());
                }
                if(!st.isEmpty() && st.peek()=='(')
                    st.pop();
               while (!q.isEmpty()) {
                    st.push(q.poll());
                }
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}