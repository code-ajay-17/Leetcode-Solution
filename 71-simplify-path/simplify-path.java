class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] folders = path.split("/");
        for (String folder : folders) {
            if (folder.equals("") || folder.equals("."))
                continue;
            else if (folder.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else
                stack.push(folder);
        }
        StringBuilder ans = new StringBuilder();
        for (String folder : stack)
            ans.append("/").append(folder);
        return ans.length() == 0 ? "/" : ans.toString();
    }
}