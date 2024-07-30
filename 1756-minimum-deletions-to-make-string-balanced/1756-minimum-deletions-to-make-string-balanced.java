class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] arr = new int[n + 1];
        int b = 0;
        for (int i = 1; i <= n; ++i) {
            if (s.charAt(i - 1) == 'b') {
                arr[i] = arr[i - 1];
                ++b;
            } else {
                arr[i] = Math.min(arr[i - 1] + 1, b);
            }
        }
        return arr[n];
    }
}