package ds.graph;

import java.util.*;

public class Graph {

    private final Map<Integer, Set<Integer>> g;

    public Graph(int n){
        g = new HashMap<>(n);
        for (int i=0; i<n; i++) g.put(i, new HashSet<>());
    }

    public void connect(int v, int w){
        g.get(v).add(w);
        g.get(w).add(v);
    }

    public boolean isConnected(int v, int w){
        return g.get(v).contains(w);
    }

    public Set<Integer> adjacentTo(int v){
        return Collections.unmodifiableSet(g.get(v));
    }
}