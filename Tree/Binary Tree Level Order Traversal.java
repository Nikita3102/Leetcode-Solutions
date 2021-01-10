class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;
        
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> onelevel=new ArrayList<>();
            int size=q.size();  
            for(int i=0;i<size;i++)
            {
                TreeNode n=q.poll();
                onelevel.add(n.val);
                if(n.left!=null)
                    q.offer(n.left);
                if(n.right!=null)
                    q.offer(n.right);
            }
            result.add(onelevel);
        }
        return result;
    }
}