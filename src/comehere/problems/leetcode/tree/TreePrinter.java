package comehere.problems.leetcode.tree;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;

public class TreePrinter implements Serializable {

    public void printTreePreorder(TreeNode head) {
        if (head == null) {
            System.out.print("null -> ");
            return;
        }

        System.out.print(head.getValue() + " -> ");
        printTreePreorder(head.getLeft());
        printTreePreorder(head.getRight());

    }

    public void printTreeInorder(TreeNode head) {
        if (head == null) {
            System.out.print("null -> ");
            return;
        }
        printTreeInorder(head.getLeft());
        System.out.print(head.getValue() + " -> ");
        ;
        printTreeInorder(head.getRight());
    }

    public void printTreePostorder(TreeNode head) {
        if (head == null) {
            System.out.print("null -> ");
            return;
        }
        printTreePostorder(head.getLeft());
        printTreePostorder(head.getRight());
        System.out.print(head.getValue() + " -> ");
    }

    public void printTreeLevelorderNotInSingleLine(TreeNode head) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (head == null) {
            System.out.print("null -> ");
            return;
        }

        int current = 0;
        int next = 0;
        queue.offer(head);
        current = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.getValue() + " -> ");
            current--;

            if (node.getLeft() != null) {
                queue.offer(node.getLeft());
                next++;
            }

            if (node.getRight() != null) {
                queue.offer(node.getRight());
                next++;
            }

            if (node.getLeft() == null) {
                System.out.print("null -> ");
            }

            if (node.getRight() == null) {
                System.out.print("null -> ");
            }


            if (current == 0) {
                System.out.println();
                current = next;
                next = 0;
            }
        }
    }

    public void printTreeLevelorderInSingleLine(TreeNode head) {
        if (head == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(head);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.getValue() + " -> ");

            if (node.getLeft() != null) {
                queue.offer(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.offer(node.getRight());
            }
        }
    }

    public static void main(String[] args) {


        TreeNode root = new TreeCreator().createTree(new int[]{1, 2, 4, 5, 8, 3, 6, 7}, new int[]{4, 2, 8, 5, 1, 6, 3, 7});
        TreeNode root2 = new TreeCreator().createTree(new int[]{1}, new int[]{1});

        System.out.println("先序遍历");
        new TreePrinter().printTreePreorder(root);
        System.out.println();
        new TreePrinter().printTreePreorder(root2);
        System.out.println();
        System.out.println("中序遍历");
        new TreePrinter().printTreeInorder(root);
        System.out.println();
        new TreePrinter().printTreeInorder(root2);
        System.out.println();
        System.out.println("后序遍历");
        new TreePrinter().printTreePostorder(root);
        System.out.println();
        new TreePrinter().printTreePostorder(root2);
        System.out.println();
        System.out.println("层序遍历（在同一行打印）");
        new TreePrinter().printTreeLevelorderInSingleLine(root);
        System.out.println();
        new TreePrinter().printTreeLevelorderInSingleLine(root2);
        System.out.println();
        System.out.println("层序遍历（不在同一行打印）");
        new TreePrinter().printTreeLevelorderNotInSingleLine(root);
        System.out.println();
        new TreePrinter().printTreeLevelorderNotInSingleLine(root2);


//        new TreePrinter().printTreePreorder(head);
    }

}
