class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        Map<Character, Character> mpp = new HashMap<>();
        for(int i = 0; i<n; i++){
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);
            if(!mpp.containsKey(s1)){
                if(!mpp.containsValue(s2)){
                    mpp.put(s1, s2);
                }
                else return false;
            }
            else{
                char c = mpp.get(s1);
                if(c != s2) return false;
            }
        }


        return true;
    }
}