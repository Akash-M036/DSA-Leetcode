class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int mainans=0;
        int consecutive=1;
        char[] ch1 = s.toCharArray();
        for(int i = 0; i< ch1.length;i++){
            char ch = ch1[i];
            if(ch=='('){
            st.push(ch);
             consecutive=consecutive*2; 

            }
            else{
                st.pop();
                consecutive=consecutive/2; 
                if (ch1[i-1]=='(') {
                    mainans+=consecutive;
                }
            }
        } 
        return mainans;


        // Stack<Character> st = new Stack<>();
        // int mainans=0;
        // int consecutive=1;
        // for(char ch : s.toCharArray()){
        //     if(ch=='('){
        //         st.push(ch);
        //     }
        //     else{
        //         if(st.peek()=='('){
        //             st.pop();
        //             consecutive=consecutive*2; 
        //             if(st.isEmpty()){
        //                 mainans += consecutive/2;
        //                 consecutive =1;
        //             }
        //         }
        //     }
        // } 
        // return mainans;
    }
}