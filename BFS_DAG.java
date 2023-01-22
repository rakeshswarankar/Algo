// BFS algoritham for directed acycling graph
//https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
class BFS_DAG {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); // as 0 is starting point
        
        ArrayList<Integer> returnList= new ArrayList<>();
        boolean visited[]= new boolean[V];
        visited[0]=true;
        
        while(!queue.isEmpty())
        {
            int size=queue.size();
            // BFS
            while(size-- >0){
                int v= queue.poll();
                returnList.add(v);
                
                //visited all the adj nodes
                for(int av: adj.get(v)){
                    if(visited[av])continue;
                    visited[av]=true;
                    queue.add(av);
                }
            }
        }
        return returnList;
    }
}
