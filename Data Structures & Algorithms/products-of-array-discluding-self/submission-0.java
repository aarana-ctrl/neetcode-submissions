class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> zeros = new ArrayList<>();
        int prod = 1;
        int idx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(idx == -1){
                    idx = i;
                }else{
                    idx = -2;
                }
            }else{
                prod *= nums[i];
            }
        }
        int[] ans = new int[nums.length];
        if(idx == -2){
            return ans;
        }
        for(int i = 0; i < nums.length; i++){
            if(i == idx && idx != -1){
                ans[i] = prod;
            }else if(idx != -1){
                ans[i] = 0;
            }else{
                ans[i] = prod/nums[i];
            }
        }
        return ans;
    }
}  
