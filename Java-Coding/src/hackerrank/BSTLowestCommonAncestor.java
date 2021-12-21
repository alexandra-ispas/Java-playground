package hackerrank;

/**
 * You are given pointer to the root of the binary search tree and two values v1 and v2. You need to
 * return the lowest common ancestor (LCA) of v1 and v2 in the binary search tree.
 */
public class BSTLowestCommonAncestor {
    public static Node lca(Node root, int v1, int v2) {
        int smallerValue = Math.min ( v1, v2 );
        int biggerValue = Math.max ( v1, v2 );

        if(root.data < smallerValue) {
            return lca(root.right, v1, v2);
        }

        if(root.data > biggerValue) {
            return lca(root.left, v1, v2);
        }

        return root;
    }

    public class Node {
        int data;
        Node left;
        Node right;
    }
}
