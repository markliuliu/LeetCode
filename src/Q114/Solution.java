package Q114;

import util.TreeNode;

class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode temp;
        if(root.left != null){
            temp = root.left;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }
}
