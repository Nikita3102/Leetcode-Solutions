class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty())
        {
            TreeNode temp=s1.pop();
            if(temp!=null)
            {
                s2.push(temp);
                s1.push(temp.left);
                s1.push(temp.right);
            }
        }
        while(!s2.isEmpty())
        {
            result.add(s2.pop().val);
        }
        return result;
    }
}