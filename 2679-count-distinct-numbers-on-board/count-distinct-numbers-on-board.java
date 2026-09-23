class Solution {
    public int distinctIntegers(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(n);
        int temp=n-1;
        while(n>2){
            if(temp<2){
                n=n-1;
                temp=n-1;
            }
            if(n%temp==1){
                list.add(temp);
            }
            temp--;
        }
        HashSet<Integer> set=new HashSet<>(list);
        return set.size();
    }
}