class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        TreeNode temp=null;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int i=q.size();
            
            List<Integer> list=new ArrayList<>();
            while(i>0)
            {
                temp=q.remove();
                list.add(temp.val);
                i--;
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);                
            }
            res.add(list);
        }
        Collections.reverse(res);
        return res;
    }
}