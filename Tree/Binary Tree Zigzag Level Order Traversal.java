/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return new ArrayList<>();
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel=new Stack<>();
        currentLevel.push(root);
        while(!currentLevel.isEmpty() || !nextLevel.isEmpty())
        {
            List<Integer> res=new ArrayList<>();
            result.add(res);
            if(!currentLevel.isEmpty())
            {
                while(!currentLevel.isEmpty())
                {
                    TreeNode temp=currentLevel.pop();
                    res.add(temp.val);
                    if(temp.left!=null)
                        nextLevel.push(temp.left);
                    if(temp.right!=null)
                        nextLevel.push(temp.right);
                }
            }
            else
            {
                while(!nextLevel.isEmpty())
                {
                    TreeNode temp=nextLevel.pop();
                    res.add(temp.val);
                    if(temp.right!=null)
                        currentLevel.push(temp.right);
                    if(temp.left!=null)
                        currentLevel.push(temp.left);
                }
            }
        }
        return result;
    }
}