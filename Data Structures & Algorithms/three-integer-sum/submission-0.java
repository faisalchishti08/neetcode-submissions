class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length && nums[i] <=0; i++) {
            System.out.println("Hello here"); 
            if(i == 0 || nums[i] != nums[i - 1]) {
              twoSumImplementation(i, nums, result);
            }
        }
        return result;
    }

    void twoSumImplementation(int index, int[] nums, List<List<Integer>> result) {

        int left = index + 1;
        int right = nums.length - 1;

        while (left < right) {
            int localSum = nums[index] + nums[left] + nums[right];
            if (localSum > 0) {
                right--;
            } else if (localSum < 0) {
                left++;
            } else {
                result.add(Arrays.asList(nums[index], nums[left++], nums[right--]));
                while(left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
            }
        }
    }
}
