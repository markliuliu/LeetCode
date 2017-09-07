package Q538;
import util.TreeNode;
/**
 * Created by Mark on 2017/7/18.
 */
public class ConvertBSTtoGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        if(root == null)return null;
        if(root.right!=null)
        {
            convertBST(root.right);
            TreeNode temp = root.right;
            while(temp.left!=null) temp = temp.left;
            root.val += temp.val;
        }
        if(root.left!=null)
        {
            TreeNode temp = root.left;
            while(temp.right!=null) temp = temp.right;
            temp.val += root.val;
            convertBST(root.left);
        }

        return root;

    }
}
