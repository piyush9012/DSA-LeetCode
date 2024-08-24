class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;
        int zero = 0;
        int left = 0, right = 0;
        while(right < n){
            if(nums[right] == 0){
                zero++;
            }
            if(zero > k){
                if(nums[left] == 0) zero--;
                left++;
            }
            if(zero <= k){
                int len = right - left + 1;
                maxLen = Math.max(maxLen, len);
            }
            right++;
        }                                     
        return maxLen;
    }
}