public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        rightView(root, res, 0);
        return res;
    }
    
    public void rightView(TreeNode curr, List<Integer> res, int currlevel){
        if(curr == null){
            return;
        }
        if(currlevel == res.size()){
            res.add(curr.val);
        }
        
        rightView(curr.right, res, currlevel + 1);
        rightView(curr.left, res, currlevel + 1);
        
    }
}
