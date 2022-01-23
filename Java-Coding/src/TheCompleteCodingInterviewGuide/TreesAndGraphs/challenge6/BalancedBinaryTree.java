package TheCompleteCodingInterviewGuide.TreesAndGraphs.challenge6;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.TreeNode;

/**
 * Consider you've been given a binary tree. We consider it balanced if the heights
 * of the two sub-trees of any node don't differ by more than one (this is what we call a
 * height-balanced binary tree). Write a snippet of code that returns true if the binary tree
 * is balanced.
 */
public class BalancedBinaryTree<T> {
    public boolean isBalanced(TreeNode<T> root) {
        return helper ( root ) != Integer.MIN_VALUE;
    }

    public int helper(TreeNode<T> node) {
        if(node == null) {
            return 0;
        }

        int left = helper ( node.left);
        int right = helper ( node.right);

        if(left == Integer.MIN_VALUE || right == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if(Math.abs ( left - right ) > 1) {
            return Integer.MIN_VALUE;
        }
        return 1 + Math.max (left, right);
    }
}
