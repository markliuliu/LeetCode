package Q563M;

import util.TreeNode;

/**
 * TODO: I think this algorithm can be speed up.
 * Created by Mark on 2017/8/27.
 */
public class BinaryTreeTilt {
    class Solution {
        public int findTilt(TreeNode root) {
            if(root ==null)return 0;
            int leftSum = getSum(root.left);
            int rightSum = getSum(root.right);
            int leftTilt = findTilt(root.left);
            int rightTilt = findTilt(root.right);
            return Math.abs(leftSum - rightSum) + leftTilt +rightTilt;

        }
        public int getSum(TreeNode root)
        {
            if(root == null) return 0;

            return getSum(root.left)+getSum(root.right)+root.val;
        }
    }
}
