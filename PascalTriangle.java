class Solution {
    private List<Integer> pascalRow(int row) {
        int ans = 1;
        List<Integer> tempRes = new ArrayList<>();
        tempRes.add(ans);
        for (int col = 1; col < row; col++) {
            ans *= (row - col);
            ans /= col;
            tempRes.add(ans);
        }
        return tempRes;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            result.add(pascalRow(i));
        }
        return result;
    }
}
