class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int close = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n-2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int minSum = nums[i] + nums[i + 1] + nums[i + 2];
            if (minSum > target) {
                if (Math.abs(minSum - target) < Math.abs(close - target)) {
                    close = minSum;
                }
                continue;
            }
            int max = nums[i] + nums[n - 2] + nums[n - 1];
            if (max < target) {
                if (Math.abs(max - target) < Math.abs(close - target)) {
                    close = max;
                }
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum == target) {
                    return currentSum;
                }
                if (Math.abs(currentSum - target) < Math.abs(close - target)) {
                    close = currentSum;
                }

                if (currentSum < target) {
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return close;
    }
}
