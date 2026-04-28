class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        recursiveCombination(target, 
        result,
        combination,
        nums,
        0
        );
        return result; 
    }

    public void recursiveCombination(int target, 
        List<List<Integer>> result,
        List<Integer> combination,
        int[] nums,
        int start
        ) {

            if(target == 0) {
                result.add(new ArrayList<>(combination));
            }
            if(target < 0) {
                return;
            }

            for(int i = start; i < nums.length; i++){
                combination.add(nums[i]);
                recursiveCombination(target - nums[i], 
                    result,
                    combination,
                    nums,
                    i
                );
                combination.remove(combination.size() - 1);
            }

        }
}
