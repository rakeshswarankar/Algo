// use following link to paste this solution and run it
// Topology sort using DFS and STACK
// Link to the probelm
//https://practice.geeksforgeeks.org/problems/topological-sort/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
//
class TopologySort
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        boolean visited[] = new boolean[V];
        
        List<Integer> retList= new ArrayList<>();
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,adj,visited,retList);
            }
        }
        
        int returnArray[]= new int[V];
        for(int i=0;i<V;i++){
            returnArray[i]=retList.get(V-i-1);
        }
        return returnArray;
    }
    
    static void dfs(int index,ArrayList<ArrayList<Integer>> adj,boolean visited[],List<Integer> retList){
        visited[index]=true;
        
        for(int v:adj.get(index)){
            if(!visited[v]){
                dfs(v,adj,visited,retList);
            }
        }
        retList.add(index);
    }
}
