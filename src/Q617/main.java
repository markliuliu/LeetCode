package Q617;

import util.TreeNode;

/**
 * Created by Mark on 2017/7/1.
 */
public class main {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)return null;
        if (t1 == null) {
            return t2;
        }
        else if (t2 == null) {
            return t1;
        }
        else {
            TreeNode leftChild = mergeTrees(t1.left, t2.left);
            TreeNode rightChild = mergeTrees(t1.right, t2.right);
            TreeNode node = new TreeNode(t1.val+t2.val);
            node.left=leftChild;
            node.right=rightChild;
            return node;
        }
    }


}
