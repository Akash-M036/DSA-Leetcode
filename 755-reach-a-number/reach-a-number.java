class Solution{
    public int reachNumber(int target) {
    target = target < 0 ? -target : target;
    
    int left = 0;
    int right = target;
    int ans = -1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2; 
        long val = (long) mid * (mid + 1) / 2;
        
        if (val == target) {
            return mid; 
        } else if (val < target) {
            left = mid + 1;
        } else {
            ans = mid; 
            right = mid - 1;
        }
    }
    
    long finalVal = (long) ans * (ans + 1) / 2;
    long diff = finalVal - target;
    
    if (diff % 2 == 0) {
        return ans;
    } else {
        return ans + (ans % 2 == 0 ? 1 : 2);
    }
}
}
