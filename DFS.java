class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> retList= new ArrayList<>();
        boolean visited[]= new boolean[V];
           
        if(V == 0) return retList;
        for(int i=0;i<V;i++){
            if(!visited[i])
                dfs(adj,0,retList,visited);
        }
        
        return retList;
    }
    
    void dfs(ArrayList<ArrayList<Integer>> adj,int v, ArrayList<Integer> retList,boolean visited[]){
        
        retList.add(v);
        visited[v]=true;
        
        ArrayList<Integer> list= adj.get(v);
        for(int u: list){
            if(!visited[u])
                dfs(adj,u,retList,visited);
        }
    }
}
