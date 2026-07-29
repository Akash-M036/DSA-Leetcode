class Solution {
    String[] keypad = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void comb(int idx,String dig, List<String> ans,String check){
        if(check.length()== dig.length()){
            ans.add(check);
            return;
        }
            String val = keypad[dig.charAt(idx) -'0'];
            for(int i =0; i< val.length();i++){
                comb(idx+1,dig,ans,check+val.charAt(i));
            
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        comb(0,digits,ans,"");
        return ans;
    }
}