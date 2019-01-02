package problems.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            list.add(root.getValue() + "");
            return list;
        }

        List<String> leftS = binaryTreePaths(root.getLeft());
        for (int i = 0; i < leftS.size(); i++) {
            list.add(root.getValue() + "->" + leftS.get(i));
        }

        List<String> rightS = binaryTreePaths(root.getRight());
        for (int i = 0; i < leftS.size(); i++) {
            list.add(root.getValue() + "->" + rightS.get(i));
        }
        return list;

    }

}
