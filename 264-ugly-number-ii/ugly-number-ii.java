class Solution {
    public int nthUglyNumber(int n) {
        // 2000 approx = n
        // n^2logn -  ok
        if(n<=6) return n;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        pq.offer(1L);
        int[] primes ={2,3,5};
        long curr =1;
        while(n!=0){
             curr =(pq.poll());
            for(int p : primes){
                long x = 1L*p*curr;
                if(!set.contains(x)){
                    set.add(x);
                    pq.offer(x);
                }
            }
            n--;
        }
        return (int)curr;
    }
}