class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int lheight=0,rheight=0;
        lheight=maxDepth(root.left);
        rheight=maxDepth(root.right);
        if(lheight>rheight)
        {
            return lheight+1;
        }
        else
        {
            return rheight+1;
        }
    }
}