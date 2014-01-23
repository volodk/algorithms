package graphs;

// Volodymyr_Krasnikov1 <vkrasnikov@gmail.com> 2:57:14 PM 

public class DIGraph extends Graph {
    
    private boolean loopsAllowed;

    public DIGraph(int v, boolean loopsAllowed) {
        super(v);
        this.loopsAllowed = loopsAllowed;
    }
    
    @Override
    public void addEdge(int from, int to) {
        if(from != to || ( from == to && loopsAllowed) )
            adjList.get(from).add(to);
    }
    
    @Override
    public void removeEdge(int from, int to) {
        adjList.get(from).remove(to);
    }
    
    @Override
    public int E(){
        int E = 0;
        for( int i = 0; i < adjList.size(); i++ ){
            E += adjList.get(i).size();
        }
        return E;
    }

}