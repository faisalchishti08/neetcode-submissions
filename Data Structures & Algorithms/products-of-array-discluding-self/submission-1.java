class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] results = new int[nums.length];
        Arrays.fill(results, 1);
        int pre = 1;
        int post = 1;

        for(int i = 0; i < nums.length; i++) {
            results[i] = pre;
            pre = pre * nums[i];
        }

        for(int j = nums.length - 1; j>=0; j--){
            results[j] = results[j] * post;
            post = post * nums[j];
        }
        return results;
        
    }
}  
