import java.util.*;
public class bellmanford {
    public static void main(String[] args) {
        int ver = 5; // number of vertices
        int edg = 8; // number of edges

        // edges[i][0] = src, edges[i][1] = dest, edges[i][2] = weight
        int[][] edges = {
                {0, 1, -1},
                {0, 2, 4},
                {1, 2, 3},
                {1, 3, 2},
                {1, 4, 2},
                {3, 2, 5},
                {3, 1, 1},
                {4, 3, -3}
        };
        int[] dist=new int[ver];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;  //source
        for(int i=0;i<ver-1;i++){
            for(int j=0;j<edg;j++){
                int u=edges[j][0];
                int v=edges[j][1];
                int w=edges[j][2];
                if(dist[u] != Integer.MAX_VALUE && dist[u] + w<dist[v]){
                    dist[v]=dist[u]+w;
                }
            }
        }
        for(int j=0;j<edg;j++){
            int u=edges[j][0];
            int v=edges[j][1];
            int w=edges[j][2];
            if(dist[u] != Integer.MAX_VALUE && dist[u] + w<dist[v]){
                System.out.println("Negative weight cycle");
                return;
            }
        }
        System.out.println(Arrays.toString(dist));
    }
}
