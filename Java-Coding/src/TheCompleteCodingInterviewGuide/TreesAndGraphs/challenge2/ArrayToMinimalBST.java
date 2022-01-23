package TheCompleteCodingInterviewGuide.TreesAndGraphs.challenge2;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.TreeNode;

/**
 * Consider you've been given a sorted (ascending order) array of integers. Write a
 * snippet of code that creates the minimal BST from this array. We define the minimal BST
 * as the BST with the minimum height.
 */
public class ArrayToMinimalBST<T> {
    public TreeNode<T> arrayToBST (T[] arr) {
        return arrayToBSTHelper ( arr, 0, arr.length - 1 );
    }

    public TreeNode<T> arrayToBSTHelper (T[] arr, int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = end + (start - end) / 2;
        TreeNode<T> root = new TreeNode<> (arr[mid]);
        root.left = arrayToBSTHelper ( arr, start, mid - 1 );
        root.right = arrayToBSTHelper ( arr, mid + 1, end );

        return root;
    }
}
