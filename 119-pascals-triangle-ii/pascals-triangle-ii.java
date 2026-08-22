class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long value = 1;
        for(int col = 0; col <= rowIndex; col++) {
            ans.add((int)value);
            value = value * (rowIndex - col) / (col + 1);
        }
        return ans;
    }
}