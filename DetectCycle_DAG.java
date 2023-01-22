class DetectCycle_DAG {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        boolean visited[]= new boolean[V];
        boolean completed[]= new boolean[V]; // just in case 0 is not the starting position
        
        for(int i=0;i<V;i++)
        {
            if(completed[i])continue;
            
            if(dfs(visited,completed,adj,i)) return true;
        }
        return false;
    }
    
    boolean dfs(boolean visited[],boolean completed[],ArrayList<ArrayList<Integer>> adj,int v){
        
        visited[v]=true;
        
        for(int av:adj.get(v)){
            if(visited[av]) return true;
            if(completed[av]) continue;
            if(dfs (visited, completed, adj, av)) return true;
        }
        completed[v]=true;
        visited[v]=false;
        return false;
    }
}
