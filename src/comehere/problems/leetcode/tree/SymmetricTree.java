package comehere.problems.leetcode.tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return symmetric(root.getLeft(), root.getRight());

    }

    public boolean symmetric(TreeNode l, TreeNode r) {
        //两树都为空，那么就是对称的
        if (l == null && r == null) {
            return true;
        }

        //如果一棵树为空，那么一定是不对称的
        if (l == null || r == null) {
            return false;
        }

        return l.getValue() == r.getValue() && symmetric(l.getLeft(), r.getRight()) && symmetric(l.getRight(), r.getLeft());
    }
}
