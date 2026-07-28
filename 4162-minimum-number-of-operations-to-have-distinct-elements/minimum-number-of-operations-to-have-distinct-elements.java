import java.util.HashMap;

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (int i = 0; i < nums.length; i += 3) {
            if (map.size() == nums.length - i) {
                return cnt;
            }
            cnt++;
            for (int j = 0; j < 3; j++) {
                if (i + j < nums.length) {
                    int a = nums[i + j];
                    map.put(a, map.get(a) - 1);
                    if (map.get(a) == 0) {
                        map.remove(a);
                    }
                }
            }
        }
        return cnt;
    }
}
