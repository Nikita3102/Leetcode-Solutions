class Solution {
    ArrayList<Integer> res=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return -1;
        inorder(root);
        return res.get(k-1);
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}