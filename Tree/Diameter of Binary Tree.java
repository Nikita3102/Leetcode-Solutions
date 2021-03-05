class Solution {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        height(root);
        return ans - 1;
    }
    public int height(TreeNode node) {
        if (node == null) return 0;
        int L = height(node.left);
        int R = height(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }
}