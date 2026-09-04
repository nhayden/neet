class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (m.containsKey(curr)) {
                return new int[]{m.get(curr), i};
            }
            m.put(target-curr, i);
            System.out.println(String.format("idx: %d, val: %d", i, curr));
        }
        return null;
    }
}
