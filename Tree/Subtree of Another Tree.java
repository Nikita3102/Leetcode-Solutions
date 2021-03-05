class Solution {
    public boolean isSubtree(TreeNode T, TreeNode S) {
        if(S==null)
        return true;
        if(T==null)
        return false;
        if(isIdentical(T,S))
        return true;
        return isSubtree(T.left,S)||isSubtree(T.right,S);
    }
    public boolean isIdentical(TreeNode T,TreeNode S)
    {
        if(T==null && S==null)
        return true;
        if(T==null || S==null)
        return false;
        return (T.val==S.val && isIdentical(T.left,S.left) && isIdentical(T.right,S.right));
    }
}