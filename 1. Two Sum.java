class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            m.put(target - nums[i], i);
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(m.containsKey(nums[i]) && i != m.get(nums[i]))
                return new int[] {i, m.get(nums[i])};
        }
        throw new IllegalArgumentException("No solution");
    }
}