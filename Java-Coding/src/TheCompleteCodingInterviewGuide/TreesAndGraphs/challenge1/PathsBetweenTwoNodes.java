package TheCompleteCodingInterviewGuide.TreesAndGraphs.challenge1;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.GraphWithAdjacencyList;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Consider you've been given a directed graph. Write a snippet of code that
 * returns true if there is a path (route) between two given nodes.
 *
 *
 * Sol: start from one node, used BFS or DFS and check if the second node
 * is reached at some point
 */
public class PathsBetweenTwoNodes<T> {
    public boolean isPath(GraphWithAdjacencyList<T> graph, T from , T to) {
        Set<T> visited = new HashSet<> ();
        Queue<T> queue = new ArrayDeque<> ();

        queue.add ( from );
        visited.add ( from );

        while(!queue.isEmpty ()) {
            T node = queue.poll ();
            if(node == to) {
                return true;
            }

            List<T> adjacencyList = graph.getList ( node );
            for(T elem : adjacencyList) {
                if(elem != null && !visited.contains ( elem )) {
                    queue.add ( elem );
                    visited.add ( node );
                }
            }
        }
        return false;
    }
}
