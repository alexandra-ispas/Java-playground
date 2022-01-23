package TheCompleteCodingInterviewGuide.TreesAndGraphs.challenge8;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.TreeNode;

/**
 * Consider you've been given a Binary Search Tree (BST) and a node from
 * this tree. Write a snippet of code that prints the successor node of the given node in the
 * context of In-Order traversal.
 *
 * if the node, n, has the right
 * sub-tree, then the successor node, s, is the leftmost node of this right sub-tree.
 *
 * When the node, n, doesn't contain
 * the right sub-tree and n is the left child of its parent, then the successor node is this
 * parent
 *
 * When the node, n, doesn't contain the right sub-tree and n is the
 * right child of its parent, then we have to traverse upward until n becomes the left child
 * of its parent. Once we've done that, we return this parent
 */
public class Successor<T> {
    TreeNode<T> inOrderSuccessor(TreeNode<T> node) {
        if(node == null) return null;

        if(node.right != null) {
            return getLeftmostNode(node.right);
        }

        if(node.parent != null && node.parent.left == node) {
            return node.parent;
        }

        while (node.parent != null && node.parent.right == node) {
            node = node.parent;
        }
        return node.parent;
    }

    TreeNode<T> preOrderSuccessor (TreeNode<T> node) {
        if(node == null) return null;

        if(node.left != null) {
            return node.left;
        }

        if(node.right != null) {
            return node.right;
        }

        while(node.parent != null && (node.parent.right == null || node.parent.right == node)) {
            node = node.parent;
        }
        if(node.parent == null)
            return null;
        return node.parent.right;
    }

    TreeNode<T> postOrderSuccessor (TreeNode<T> node) {
        if (node == null) return null;
        if (node.parent == null) return null;

        if ((node.parent.right == node) ||
                (node.parent.right == null)) {
            return node.parent;
        }

        return getLeftmostNode ( node.parent.right );
    }

    TreeNode<T> getLeftmostNode(TreeNode<T> node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }
}
