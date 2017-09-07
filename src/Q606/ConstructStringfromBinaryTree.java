package Q606;

import util.TreeNode;

/**
 * Created by Mark on 2017/8/3.
 */
public class ConstructStringfromBinaryTree {

    public String tree2str(TreeNode t) {
        StringBuilder output = new StringBuilder();
        output = tree2str(t, output);
        return output.toString();
    }
    public StringBuilder tree2str(TreeNode t, StringBuilder output)
    {
        output.append(t.val);
        if(t.right==null && t.left ==null)return output;
        output.append("(");
        if(t.left!=null) output = tree2str(t.left, output);
        output.append(")");
        if(t.right!=null)
        {
            output.append("(");
            output = tree2str(t.right,output);
            output.append(")");
        }
        return output;
    }
}
