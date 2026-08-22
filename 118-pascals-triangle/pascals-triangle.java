class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            int num = 1;
            for(int col = 0; col <= row; col++) {
                currentRow.add(num);
                num = num * (row - col) / (col + 1);
            }
            ans.add(currentRow);
        }
        return ans;
    }
}