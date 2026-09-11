class Solution {
    public int totalNumbers(int[] digits) {
        //int[] nums = digits.clone();
        // int zeros=0;
        // int even = 0;
        // HashSet<Integer> set = new HashSet<>();
        // for(int i =0; i< digits.length;i++){
        //     if(set.contains(digits[i]))
        //         continue;
        //     if(digits[i]==0)
        //         zeros++;
        //     else if(digits[i]%2==0)
        //         even++;
        //     set.add(digits[i]);
        // }
        // int rem = digits.length-zeros-even;
        // int x = (rem+zeros+even-1);
        // if(zeros==0){
        //     int rem1 = set.size()-zeros-even;
        //      int x1 = (rem1+zeros+even-1);
        //     return x1*(x1-1)*(even+zeros);
        // }
        // return (x-zeros)*(x-1)*(even+zeros);
         HashMap<Integer,Integer> set = new HashMap<>();
         for(int i =0; i< digits.length;i++){
       
             set.put(digits[i],set.getOrDefault(digits[i],0)+1);
         }
         int ans =0;
        for(int i =100 ; i<=999;i++){
            int st = i/100;
            int sec = (i/10)%10;
            int th = i%10;
            if(set.containsKey(st)){
                set.put(st,set.get(st)-1);
                if(set.get(st)==0) set.remove(st);
                if(set.containsKey(sec)){
                    set.put(sec,set.get(sec)-1);
                    if(set.get(sec)==0) set.remove(sec);
                    if(set.containsKey(th) && th%2==0){
                        ans++;
                    }
                    set.put(sec,set.getOrDefault(sec,0)+1);
                }
                set.put(st,set.getOrDefault(st,0)+1);
            }
              // if(th%2==0) ans++;
        }
        return ans;
    }
}