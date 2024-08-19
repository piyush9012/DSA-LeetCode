class Solution {
    // public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     if (n == 0) return;
    //     k = k % n;
    //     if (k > n) return;
    //     int[] temp = new int[k];
    //     for (int i = n - k; i < n; i++) {
    //         temp[i - n + k] = nums[i];
    //     }
    //     for (int i = n - k - 1; i >= 0; i--) {
    //         nums[i + k] = nums[i];
    //     }
    //     for (int i = 0; i < k; i++) {
    //         nums[i] = temp[i];
    //     }
    // }
    public void reverse(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
}