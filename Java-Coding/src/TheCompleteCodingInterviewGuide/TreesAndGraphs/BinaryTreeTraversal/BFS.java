package TheCompleteCodingInterviewGuide.TreesAndGraphs.BinaryTreeTraversal;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * This is a plain BFS implementation, and it doesn't take cycles into account
 */
public class BFS {
    public static void bfs (TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<> ();
        queue.add ( root );

        while (!queue.isEmpty ()) {
            TreeNode aux = queue.poll ();
            System.out.print (aux.getData () + " ");
            if(aux.getLeft () != null) {
                queue.add ( aux.getLeft () );
            }
            if(aux.getRight () != null) {
                queue.add ( aux.getRight () );
            }
        }
    }
}
