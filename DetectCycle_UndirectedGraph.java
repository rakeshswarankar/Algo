class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean visited[] = new boolean[V];
        
            
        for(int v=0;v < V; v++){
            if(!visited[v])
                if(dfs(visited,  adj,v,-1)) return true;
            
        }
        
        return false;
    }
    
    boolean dfs(boolean visited[],ArrayList<ArrayList<Integer>> adj,int v,int parent){
        
        visited[v]=true;
        
        for(int av: adj.get(v)){
                if(!visited[av]){ 
                    if(dfs(visited, adj, av, v)) return true;
                    
                }
                else if(av!=parent){
                    return true;
                }
            }
        return false;
    }
}
