class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++) {
            int currentTarget = target - nums[i];
            for(int j=0; j<nums.length; j++) {
                if(i != j && nums[j] == currentTarget) {
                    return new int[]{i, j};
                }
            }
        }
        
        return new int[]{-1};
    }
}
