class Solution {
    public int lengthOfLIS(int[] nums) {

        int[] listCounter = new int[nums.length];
        int max = 1;
        Arrays.fill(listCounter, 1);

        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    listCounter[i] = Math.max(listCounter[i], 1 + listCounter[j]);
                    max = Math.max(max, listCounter[i]);
                }
            }
        }
        return max;
        
    }
}
