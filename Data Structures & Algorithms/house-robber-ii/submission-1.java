class Solution {
    public int rob(int[] nums) {

        int firstMax = 0;
        int secondMax = 0;

        int totalMax1 = 0;

        if(nums.length == 1) {
            return nums[0];
        }

        for(int i = 0; i < nums.length - 1; i++) {
            totalMax1 = Math.max(firstMax + nums[i], secondMax);
            firstMax = secondMax;
            secondMax = totalMax1;
        }
        firstMax = 0;
        secondMax = 0;
        int totalMax2 = 0;
        for(int i = 1; i < nums.length; i++) {
            totalMax2 = Math.max(firstMax + nums[i], secondMax);
            firstMax = secondMax;
            secondMax = totalMax2;
        }

        return Math.max(totalMax2, totalMax1);
        
    }
}
