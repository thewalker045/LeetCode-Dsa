class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int indegree[]=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            for(int j:adj.get(i)) indegree[j]++;
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)q.offer(i);
        }

        List<Integer> topo=new ArrayList<>();
        int i=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.poll();
            topo.add(node);

            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.offer(it);
            }
        }
       

        if(topo.size()==numCourses) return true;

        return false;
    }
}