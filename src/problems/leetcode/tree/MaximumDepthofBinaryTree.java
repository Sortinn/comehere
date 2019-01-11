package problems.leetcode.tree;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight())) + 1;
    }
}
