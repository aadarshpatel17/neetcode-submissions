class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int currentTarget = target - nums[i];
            if(map.containsKey(currentTarget)) {
                return new int[]{map.get(currentTarget), i};
            }
            map.put(nums[i], i);
        }

        // for(int i=0; i<nums.length; i++) {
        //     int currentTarget = target - nums[i];
        //     for(int j=0; j<nums.length; j++) {
        //         if(i != j && nums[j] == currentTarget) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        
        return new int[]{-1};
    }
}
