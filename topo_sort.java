import java.util.*;

public class topo_sort {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {
                {0, 1}, {0, 4}, {4, 5}, {4, 2},
                {1, 2}, {2, 3}, {5, 3}
        };
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
        }
        boolean[] vis = new boolean[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(adj,vis,i,s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

    private static void dfs(List<List<Integer>> adj, boolean[] vis, int i, Stack<Integer> s) {
        vis[i]=true;
        for(int n:adj.get(i)){
            if(!vis[n]){
                dfs(adj,vis,n,s);
            }
        }
        s.push(i);
    }
}
