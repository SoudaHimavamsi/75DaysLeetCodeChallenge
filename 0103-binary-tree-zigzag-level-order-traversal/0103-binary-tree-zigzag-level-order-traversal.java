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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList();

        q.add(root);
        boolean ltor = true;
        while(!q.isEmpty()){
            int size = q.size();
            Deque<Integer> d = new ArrayDeque();
            for(int i =0;i<size;i++){
                TreeNode  cur = q.poll();
                if(ltor){
                    d.addLast(cur.val);
                }
                else{
                    d.addFirst(cur.val);
                }
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            ltor=!ltor;
            res.add(new ArrayList<>(d));
        }
        return res;
    }
}