class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new LinkedList<>();
        for(int i = 0;i<numCourses;i++){
            adj.add(new LinkedList<>());
        }
        int ind[] = new int[numCourses];

        for(int[] arr: prerequisites){
            adj.get(arr[1]).add(arr[0]);
            ind[arr[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<numCourses;i++){
            if(ind[i] == 0) q.offer(i);
        }
        int numCourses_completed =0;
        while(!q.isEmpty()){
            int curr = q.poll();
            numCourses_completed++;

            for(int nei: adj.get(curr)){
                ind[nei]--;
                if(ind[nei]==0) q.offer(nei);
            }
        }
        return numCourses == numCourses_completed;
    }
}