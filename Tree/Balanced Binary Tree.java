class Solution {
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        int lheight=height(root.left);
        int rheight=height(root.right);
        return lheight>rheight?lheight+1:rheight+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int lh=height(root.left);
        int rh=height(root.right);
        return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
        
    }
}