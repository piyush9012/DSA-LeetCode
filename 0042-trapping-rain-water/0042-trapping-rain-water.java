class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int waterTrapped = 0;
        int leftMax = 0, rightMax = 0;
        int l = 0,r = n-1;
        while(l < r){
            if(arr[l] < arr[r]){
                if(arr[l] < leftMax){
                    waterTrapped += leftMax - arr[l];
                }
                else{
                    leftMax = arr[l];
                }
                l++;
            }
            else{
                if(arr[r] < rightMax){
                    waterTrapped += rightMax - arr[r];
                }
                else{
                    rightMax = arr[r];
                }
                r--;
            }
        }
        return waterTrapped;
    }
}