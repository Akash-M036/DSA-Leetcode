class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> ls : knowledge){
            map.put(ls.get(0),ls.get(1));
        }
        int eval =0;
        StringBuilder sb = new StringBuilder(); 
        StringBuilder sb2 = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='('){
                eval =1;
                continue;
            }
            if(ch==')'){
                String x = sb2.toString();
                String y = map.getOrDefault(x,"?");
                sb.append(y);
                eval=0;
                sb2=new StringBuilder();
                continue;
            }
            if(eval==1){
                sb2.append(ch);
                continue;
            }
            if(eval==0){
                sb.append(ch);
                continue;
            }
        }
    return sb.toString();
    }
}