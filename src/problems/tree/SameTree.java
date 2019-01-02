package problems.tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.getValue() == q.getValue()
                && isSameTree(p.getLeft(), p.getLeft()) && isSameTree(p.getRight(), q.getRight())) {
            return true;
        }
        return false;
    }
}
