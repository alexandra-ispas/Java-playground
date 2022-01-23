package TheCompleteCodingInterviewGuide.TreesAndGraphs.GraphTraversal;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.GraphWithAdjacencyMatrix;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * BFS is mainly used for graphs.
 * In the case of graphs, we must consider that a graph may have cycles. A plain BFS
 * implementation (as you saw in the case of binary trees) doesn't take cycles into account,
 * so we risk an infinite loop while traversing the BFS queue. Eliminating this risk can be
 * done via an additional collection that holds the visited nodes.
 *
 * I considered the graph to be represented using an adjacency matrix.
 */
public class BFS<T> {
    public void bfs (GraphWithAdjacencyMatrix<T> graph, T root) {
        Set<T> visited = new HashSet<> ();
        Queue<T> queue = new ArrayDeque<> ();

        visited.add ( root );
        queue.add ( root );

        while(!queue.isEmpty ()) {
            T aux = queue.poll ();

            System.out.print (aux + " ");

            ArrayList<T> children = graph.findAdjacentNodes ( graph, aux );
            for(T child : children) {
                if(!visited.contains ( child )) {
                    queue.add ( child );
                    visited.add ( child );
                }
            }
        }
    }
}
