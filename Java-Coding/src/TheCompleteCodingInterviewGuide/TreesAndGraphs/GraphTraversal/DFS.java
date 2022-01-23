package TheCompleteCodingInterviewGuide.TreesAndGraphs.GraphTraversal;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.GraphWithAdjacencyMatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS<T> {
    /**
     * 1. Start from the current node (the given node) and mark the current node as visited
     * (add it to the collection of visited nodes).
     * 2. Visit the current node.
     * 3. Traverse the unvisited adjacent vertices via recursion.
     */
    public void dfsRecursive(GraphWithAdjacencyMatrix<T> graph, T startNode) {
        Set<T> visited = new HashSet<> ();
        dfsRecursiveHelper ( graph, startNode, visited );
    }
    public void dfsRecursiveHelper(GraphWithAdjacencyMatrix<T> graph, T node, Set<T> visited) {
        visited.add ( node );
        System.out.println (node + " ");

        ArrayList<T> children = graph.findAdjacentNodes ( graph, node );
        for(T child : children) {
            if(child != null && !visited.contains ( child )) {
                dfsRecursiveHelper ( graph, child, visited );
            }
        }
    }

    /**
     * 1. Start from the current node (the given node) and push the current node into Stack.
     * 2. While Stack is not empty, do the following:
     *  a. Pop the current node from Stack.
     *  b. Visit the current node.
     *  c. Mark the current node as visited (add it to the collection of visited nodes).
     *  d. Push the unvisited adjacent vertices into Stack.
     */
    public void dfsIterative (GraphWithAdjacencyMatrix<T> graph, T startNode) {
        Set<T> visited = new HashSet<> ();
        Stack<T> stack = new Stack<> ();

        stack.push ( startNode );

        while(!stack.isEmpty ()) {
            T node = stack.pop ();
            System.out.println (node + " ");
            visited.add ( node );

            ArrayList<T> children = graph.findAdjacentNodes ( graph, node );
            for(T child : children) {
                if(child != null && !visited.contains ( child )) {
                    stack.push ( child );
                }
            }
        }
    }
}
