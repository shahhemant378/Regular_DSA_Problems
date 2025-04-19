class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        Arrays.sort(nums);
        
        long ans = 0;
        for (int i = 0; i < n - 1; ++i) {
            int lb = lowerBound(nums, i + 1, n, lower - nums[i]); //for finding the pairs , i am finding the upper and lower bound where in between all the numbers will be pairs 
            int ub = upperBound(nums, i + 1, n, upper - nums[i]); // with current number
            ans += (ub - lb);
        }
        return ans;
    }
    
    private int lowerBound(int[] nums, int start, int end, int target) { // finding the lowerBound of pairs
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    private int upperBound(int[] nums, int start, int end, int target) {//finding the upperbound of pairs
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}
