package TheCompleteCodingInterviewGuide.TreesAndGraphs.BinaryTreeTraversal;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.TreeNode;

public class DFS {
    public static void pre_order(TreeNode root) {
        if(root == null) return;
        System.out.print (root.getData () + " ");
        pre_order ( root.getLeft () );
        pre_order ( root.getRight () );
    }

    public static void in_order(TreeNode root) {
        if(root == null) return;
        in_order ( root.getLeft () );
        System.out.print (root.getData () + " ");
        in_order ( root.getRight () );
    }

    public static void post_order(TreeNode root) {
        if(root == null) return;
        post_order ( root.getLeft () );
        post_order ( root.getRight () );
        System.out.print (root.getData () + " ");
    }
}
