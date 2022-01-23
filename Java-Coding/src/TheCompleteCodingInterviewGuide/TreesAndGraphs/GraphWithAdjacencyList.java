package TheCompleteCodingInterviewGuide.TreesAndGraphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphWithAdjacencyList<T> {
    private final Map<T, List<T>> adjacencyList;

    public GraphWithAdjacencyList() {
        this.adjacencyList = new HashMap<> ();
    }

    public List<T> getList(T node) {
        return adjacencyList.get ( node );
    }
}
