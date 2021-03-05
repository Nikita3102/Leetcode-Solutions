class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode temp=s.pop();
            if(temp!=null)
            {
                result.add(temp.val);
                s.push(temp.right);
                s.push(temp.left);
            }
        }
        return result;
    }
}