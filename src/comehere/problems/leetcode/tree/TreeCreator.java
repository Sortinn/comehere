package comehere.problems.leetcode.tree;

import java.util.Arrays;

public class  TreeCreator {

    public TreeNode createTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootValue = preorder[0];
        TreeNode root = new TreeNode(rootValue);
        StringBuilder preOrderString = new StringBuilder();
        for (int i = 0; i < preorder.length; i++) {
            preOrderString.append(preorder[i]);
        }
        StringBuilder inOrderString = new StringBuilder();
        for (int i = 0; i < inorder.length; i++) {
            inOrderString.append(inorder[i]);
        }
        int rootIndex = inOrderString.toString().indexOf(String.valueOf(rootValue));

        root.setLeft(
                createTree(
                        Arrays.copyOfRange(preorder, 1, rootIndex + 1), Arrays.copyOfRange(inorder, 0, rootIndex)));
        root.setRight(
                createTree(
                        Arrays.copyOfRange(preorder, rootIndex + 1, preorder.length), Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length)));

        return root;
    }
}
