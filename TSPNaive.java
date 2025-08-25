public class TSPNaive {
    static int tsp(int[][] graph, boolean[] visited,int n, int pos, int count,int cost, int start){
        if(n==count && graph[pos][start]>0){
            return cost+graph[pos][start];
        }
        int ans=Integer.MAX_VALUE;
        for(int city=0;city<n;city++){
            if(!visited[city] && graph[pos][city]>0){
                visited[city]=true;
                int newans=tsp(graph,visited,n,city,count+1,cost+graph[pos][city],start);
                ans=Math.min(ans,newans);
                visited[city]=false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] graph = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };
        int n = graph.length;
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int result = tsp(graph, visited, n, 0, 1, 0, 0);
        System.out.println("Minimum cost: " + result);
    }
}