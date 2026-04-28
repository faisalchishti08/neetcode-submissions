class Solution {
    public int[] twoSum(int[] nums, int target) {

       Map<Integer, Integer> trackMap = new HashMap<>();

       int i = 0;
       for(int num : nums) {
            if(trackMap.containsKey(target - num)) {
                return new int[]{trackMap.get(target - num), i};
            }
            trackMap.put(num, i);
            i++;
       }
       return null;
    }
}
