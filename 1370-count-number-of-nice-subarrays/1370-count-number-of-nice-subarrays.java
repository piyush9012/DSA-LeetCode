class Solution {
    int numberOfSubarrays(int nums[], int k) {
        int res = 0, count = 0;
        int l = 0;
        
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 != 0) {
                k--;
                count = 0;
            }
            while (k == 0) {
                k += nums[l++] % 2;
                count++;
            }
            res += count;
        }
        return res;
    }
};