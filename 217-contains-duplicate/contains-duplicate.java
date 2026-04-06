class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<size;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}