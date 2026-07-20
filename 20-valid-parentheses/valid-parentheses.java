class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        boolean valid=true;
        for(char ch:s.toCharArray()){
            if(ch=='{'||ch=='['||ch=='(') stack.push(ch);
            else{
                if(stack.isEmpty()){
                    valid=false;
                    break;
                }
                char top=stack.pop();
                if((ch=='}'&&top!='{') || (ch==']'&&top!='[') || (ch==')'&&top!='(')) {
                    valid=false;
                    break;
                }
            }
        }
        if(valid && stack.isEmpty()) return true;
        else return false;   
    }
}