package TheCompleteCodingInterviewGuide.TreesAndGraphs.challenge7;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.TreeNode;

/**
 * Consider you've been given a binary tree that may contain duplicates. Write a
 * snippet of code that returns true if this tree is a Binary Search Tree (BST).
 *
 * left <= n < right
 */
public class BinaryTreeIsBST {

    public boolean isBSTHelper(TreeNode<Integer> root, int min, int max) {
        if(root == null) return true;

        if(root.getData () >= min && root.getData () < max) {
            return isBSTHelper ( root.getLeft (), min, root.getData () + 1 ) &&
                    isBSTHelper ( root.getRight (), root.getData (), max);
        } else {
            return false;
        }
    }

    public boolean isBST(TreeNode<Integer> root) {
        return isBSTHelper ( root, Integer.MIN_VALUE, Integer.MAX_VALUE );
    }
}
