class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length ==0) {
            return 0;
        }

        int max = nums[0];
        int min = nums[0];
        int result = max;

        for(int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int temp = Math.max(current, Math.max(current * min, current * max));
            min = Math.min(current, Math.min(current * min, current * max));
            max = temp;
            result = Math.max(max, result);
        }
        return result;   
    }
}
