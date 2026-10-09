class Solution {
    public int minInsertions(String s) {
        double x =0;
        int ans =0;
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='('){
                 if (x==0.5) {
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                        ans +=1;
                    } 
                    else {
                        ans +=2;
                    }
                    x = 0;
                 }
                 
                st.push(ch);
            }
            else{
                x+=0.5;
                if(x==1){
                    if(!st.isEmpty() && st.peek()=='('){
                        st.pop();
                    }
                    else{
                        ans++;
                    }
                        x=0;
                }
            }
        }
        if(x!=0){
            if (x==0.5) {
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                        ans+=1;
                    } 
                    else {
                        ans+=2;
                    }
                    x = 0;
               }
        }
        ans += (st.size() * 2);
        return ans;
    }
    
}