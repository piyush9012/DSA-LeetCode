class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int n = nums.length;
        ans[0] = ans[1] = -1;
        HashMap <Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int required = target - num;
            if(mpp.containsKey(required)){
                ans[0] = mpp.get(required);
                ans[1] = i;
                return ans;
            }
            else mpp.put(nums[i], i);
        }
        return ans;
    }
}