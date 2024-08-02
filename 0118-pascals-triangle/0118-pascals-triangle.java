class Solution {
    public List<List<Integer>> generate(int numRows) { 
        List<List<Integer>> ans = new ArrayList<>();
        int res = 1;

        for(int row = 1; row <= numRows; row++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int col = 1; col < row; col++){
                res = res * (row-col);
                res = res/col;
                temp.add(res);
            }
            ans.add(temp);
        }
        return ans;
    }
}