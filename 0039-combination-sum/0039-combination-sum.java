class Solution {
    public void find(int arr[], int target, int i, List<List<Integer>> ans, List<Integer> ds){
        if(i == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[i] <= target){
            ds.add(arr[i]);
            find(arr, target - arr[i], i, ans, ds);
            ds.remove(ds.size()-1);
        }
        find(arr, target, i+1, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        find(arr, target, 0, ans, new ArrayList<>());
        return ans;    
    }
}