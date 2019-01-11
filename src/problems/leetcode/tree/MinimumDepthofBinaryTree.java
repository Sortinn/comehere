package problems.leetcode.tree;

public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }


        if (root.getLeft() == null) {
            return minDepth(root.getRight()) + 1;
        }

        if (root.getRight() == null) {
            return minDepth(root.getLeft()) + 1;
        }

        return Math.min(minDepth(root.getLeft()), minDepth(root.getRight())) + 1;
    }
}
