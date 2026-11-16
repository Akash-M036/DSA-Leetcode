class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder();
        //int k1 =2;
        while(true){
            if(s.length()<=k) return s;
           int i =0;
           while(i<s.length()){
                if(i+k>=s.length()){
                   String s1 =s.substring(i);
                int sum=0;
                for(char ch :s1.toCharArray()){
                    int val = ch-'0';
                    sum+=val;
                }
                sb.append(sum+"");
                    break;
                }
                String s1 =s.substring(i,i+k);
                int sum=0;
                for(char ch :s1.toCharArray()){
                    int val = ch-'0';
                    sum+=val;
                }
                sb.append(sum+"");
                i+=k;
           }
           s= sb.toString();
           sb = new StringBuilder();
        }
      //  return s;
    }
}