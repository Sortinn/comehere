package problems.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//使用stack实现非递归遍历树

public class TreeTraversal {

    private class Command {
        String s; //go:访问; print:打印
        TreeNode node;

        public Command(String s, TreeNode node) {
            this.s = s;
            this.node = node;
        }
    }

    /**
     * 前序遍历
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Stack<Command> stack = new Stack<>();
        stack.push(new Command("go", root));
        while (!stack.isEmpty()) {
            Command command = stack.pop();
            if (command.s == "print") {
                res.add(command.node.getValue());
            } else {
                if (command.node.getRight() != null) {
                    stack.push(new Command("go", command.node.getRight()));
                }
                if (command.node.getLeft() != null) {
                    stack.push(new Command("go", command.node.getLeft()));
                }
                stack.push(new Command("print", command.node));
            }
        }
        return res;
    }

    /**
     * 中序遍历
     */

    /**
     * 后序遍历
     */
}
