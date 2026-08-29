class Solution {
    public String intToRoman(int num) {
        char[] key = new char[1001];
        Arrays.fill(key,'0');
        HashSet<Integer> set = new HashSet<>();
        set.add(1000);
        set.add(500);
        set.add(100);
        set.add(50);
        set.add(10);
        set.add(5);
        set.add(1);
        key[1000]='M';
        key[500] = 'D';
        key[100]='C';
        key[50]='L';
        key[10]='X';
        key[5]='V';
        key[1]='I';
        // int x =num;
        // int dig =0;
        // while(x>0){
        //     dig++;
        //     x/=10;
        // }
        StringBuilder sb = new StringBuilder();
         int x =num;
        int dig =0;
        while(x>0){
            int curr = (x%10)*(int)Math.pow(10,dig);
            String s ="";
            if(curr!=(4*(int)Math.pow(10,dig)) && curr!=9*(int)Math.pow(10,dig)){
            // for(int i =curr; i>=0;i--){
            //     if(i>key[i]=='0')
            //         continue;
            //     s=s+key[i];
            //     }
            int i=1000;
            while(i>=0){
                if(!set.contains(i)){
                    i--;
                    continue;
                }
                if(curr>=i){
                    curr= curr-i;
                    s=s+key[i];
                }
                else
                    i--;
            }
            }
             else{
               int  change = curr+1*(int)Math.pow(10,dig);
             int  i=1000;
            while(i>=0){
                if(!set.contains(i)){
                    i--;
                    continue;
                }
                if(change>=i){
                    change= change-i;
                    s=s+key[i];
                }
                else
                    i--;
            }
                s=key[(int)Math.pow(10,dig)]+""+s;
            }
           sb.insert(0,s);
            x/=10;
            dig++;
        }
        return sb.toString();
    }
}