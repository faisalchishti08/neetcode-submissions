class Solution {
    public int maxSubArray(int[] nums) {

        if(nums == null || nums.length < 1) {
            return 0;
        }
        int maxSum = nums[0];
        int currentSum = 0;

        for(int num : nums) {
            
            if(currentSum < 0) {
                currentSum = 0;
            }
            currentSum = currentSum + num;
            maxSum = Math.max(currentSum , maxSum);
        }
        return maxSum;
        
    }
}
