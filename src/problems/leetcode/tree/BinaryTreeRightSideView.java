package problems.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        int current = 0;
        int next = 0;
        List<LinkedList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        current++;
        LinkedList<Integer> innerList = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            innerList.add(node.getValue());
            current--;

            if(node.getLeft() != null){
                queue.offer(node.getLeft());
                next++;
            }

            if(node.getRight() != null){
                queue.offer(node.getRight());
            }

            if(current == 0){
                list.add(innerList);
                innerList = new LinkedList<>();
                current = next;
                next = 0;
            }
        }

        for(int i = 0 ; i < list.size(); i++){
            res.add(list.get(i).peekLast());
        }
        return res;
    }
}
