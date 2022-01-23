package TheCompleteCodingInterviewGuide.TreesAndGraphs;

import java.util.ArrayList;

public class GraphWithAdjacencyMatrix<T> {
    public T[] vertices;
    public int[][] adjacencyMatrix;

    public GraphWithAdjacencyMatrix(T[] vertices, int[][] adjacencyMatrix) {
        this.vertices = vertices;
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public ArrayList<T> findAdjacentNodes(GraphWithAdjacencyMatrix<T> graph, T node) {
        ArrayList<T> result = new ArrayList<> ();

        int idx = -1;
        for(int i = 0; i < graph.vertices.length; i++) {
            if(graph.vertices[i] == node) {
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            return result;
        }

        for(int i = 0; i < graph.adjacencyMatrix[idx].length; i++) {
            if(graph.adjacencyMatrix[idx][i] == 1) {
                result.add ( graph.vertices[i] );
            }
        }
        return result;
    }
}
