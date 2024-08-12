class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int left = 0;
        Set <Character> set = new HashSet<>();

        for(int i = 0; i<n; i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max, i-left+1);
            }
            else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(i));
            }
        }
        return max;
    }
}