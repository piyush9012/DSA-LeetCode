class Solution {
    public void solve(int ind, int k, int target, ArrayList<Integer> ds, List<List<Integer>> ans){
        if(ds.size() == k && target == 0){
            ans.add(new ArrayList<>(ds));
            // return;
        }

        else if (ds.size() < k && target > 0) {    
            for(int i = ind; i < 10; i++){
                ds.add(i);
                solve(i+1, k, target-i, ds, ans);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum3(int k, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(1, k, target, new ArrayList<>(), ans);
        return ans;
    }
}