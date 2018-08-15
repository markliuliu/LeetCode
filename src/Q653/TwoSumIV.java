package Q653;

import util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        Map map = new HashMap<Integer, Object>();
        return findTarget(root, k, map);
    }

    private boolean findTarget(TreeNode root, int k, Map map)
    {
        if(root ==null)return false;
        boolean returnVal = findTarget(root.left, k, map) || findTarget(root.right, k, map) || map.containsKey(k-root.val);
        map.put(root.val, null);
        return returnVal;
    }
}
