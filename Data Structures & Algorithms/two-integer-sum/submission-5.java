class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> idx = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            int find = target - nums[i];
            if(idx.keySet().contains(nums[i])){
                ans[0] = idx.get(nums[i]);
                ans[1] = i;
            }else{
                idx.put(find, i);
            }
        }
        return ans;
    }
}
