class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        int lheight=minDepth(root.left);
        int rheight=minDepth(root.right);
        if(lheight==0 || rheight==0)
            return 1+Math.max(lheight,rheight);
        return 1+Math.min(lheight,rheight);
    }
}