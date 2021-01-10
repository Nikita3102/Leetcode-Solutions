class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<TreeNode>();
        List<Integer> result=new ArrayList<Integer>();
        if(root==null)
            return result;
        TreeNode current=root;
        while(current!=null || !stack.isEmpty())
        {
            while(current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            result.add(current.val);
            current=current.right;
        }
        return result;
    }
}