class Solution {

    public boolean checkBfs(int[][] graph,int start,int color[]){
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        color[start]=0;

        while(!q.isEmpty()){
            int node=q.poll();

            for(int it:graph[node]){
                if(color[it]==-1){
                    color[it]=1-color[node];

                    q.offer(it);
                }
                else if(color[it]==color[node]) return false;
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];

        for (int i = 0; i < graph.length; i++)
            color[i] = -1;

        for (int i = 0; i < graph.length; i++) {

            if(color[i]==-1)
                if (checkBfs(graph, i, color) == false)
                    return false;
        }
        return true;
    }
}