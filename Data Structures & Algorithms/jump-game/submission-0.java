class Solution {
    public boolean canJump(int[] nums) {

        int final_cursor = nums.length - 1;

        for(int i = nums.length - 2; i >=0; i--) {

            if(i + nums[i] >= final_cursor) {
                final_cursor = i;
            }

        }
        if(final_cursor == 0) 
            return true;
        return false;
        
    }
}