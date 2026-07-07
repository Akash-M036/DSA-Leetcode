class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder x= new StringBuilder();
        int sum=0;
        String val = n +"";
        for(int i =0; i<val.length();i++){
            char dig = val.charAt(i);
            if(dig=='0')
                continue;
            else{
                x.append(dig);
                sum+=(dig-'0');
            }
        }
        if((x.toString()).equals("") )
            return 0;
        long mulfac = Long.parseLong(x.toString());
        long ans = 1L*sum*mulfac;

        return  ans;
        
    }
}