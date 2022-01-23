package TheCompleteCodingInterviewGuide.TreesAndGraphs.challenge4;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.TreeNode;

/**
 * Consider you've been given two binary trees, p and q. Write a snippet of code
 * that returns true if q is a subtree of p.
 */
public class SubTree<T> {

    public boolean areEqual(TreeNode<T> p, TreeNode<T> q) {
        if (p == null && q == null) {
            return true;
        }
        if(p == null || q == null ) {
            return false;
        }
        return (p.getData () == q.getData ())
                && areEqual ( p.left, q.left )
                && areEqual ( p.right, q.right );
    }

    public boolean isSubtree(TreeNode<T> p, TreeNode<T> q) {
        if(p == null) return false;

        if(areEqual ( p, q )) {
            return true;
        } else {
            return (isSubtree ( p.left, q ) || isSubtree ( p.right, q ));
        }
    }
}
