package hackerrank;

/**
 * For the purposes of this challenge, we define a binary search tree to be a binary tree with the
 * following properties:
 *
 * The  value of every node in a node's left subtree is less than the data value of that node.
 * The  value of every node in a node's right subtree is greater than the data value of that node.
 * The  value of every node is distinct.
 *
 * !! Any value in the left subtree is smaller than any value in the right one !!
 *
 */
public class CheckBSTValid {

    public static boolean checkBSTHelper(Node node, int min, int max) {
        if(node == null) return true;

        return (node.data > min &&
                node.data < max &&
                checkBSTHelper ( node.left, min, node.data ) &&
                checkBSTHelper ( node.right, node.data, max ));
    }

    public static boolean checkBST (Node root) {
        return checkBSTHelper ( root, Integer.MIN_VALUE, Integer.MAX_VALUE );
    }
    public class Node {
        int data;
        Node left;
        Node right;
    }
}
