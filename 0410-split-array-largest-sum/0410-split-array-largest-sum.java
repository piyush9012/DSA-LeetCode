class Solution {
    public int countPartitions(int nums[], int maxSum){
        int n = nums.length;
        int partition = 1;
        long subArraySum = 0;
        for(int i = 0; i < n; i++){
            if(subArraySum + nums[i] <= maxSum){
                subArraySum += nums[i];
            }
            else{
                partition++;
                subArraySum = nums[i];
            }
        }
        return partition;
    }
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;
        for(int i = 0; i< nums.length; i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while(low <= high){
            int mid = (low + high)/2;
            int partition = countPartitions(nums, mid);
            if(partition > k) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}