class Solution {
    public String finalString(String s) {
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<l; i++)
        {
            char ch = s.charAt(i);
            if(ch != 'i'){
                sb.append(ch);
            }
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}