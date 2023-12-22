import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Warida Rashid on 02 Nov 2015.
 */
public class Kruskal {
    public void mstKruskal(Edge[] edge, int nodeNo, int edgeNo) {
        for (int i = 0; i < edge.length - 1; i++) {
            for (int j = i + 1; j < edge.length; j++) {
                if (edge[i].weight > edge[j].weight) {
                    Edge temp = edge[i];
                    edge[i] = edge[j];
                    edge[j] = temp;
                }
            }
        }
        System.out.println("after");
        for (Edge f : edge) {
            System.out.println("Edge: " + f.n1 + " " + f.n2);
        }
        int[] disjointSet = new int[nodeNo];
        for (int i = 0; i < nodeNo; i++) {
            disjointSet[i] = i;
        }
        Queue q = new ArrayDeque<Edge>(edgeNo);
        int weight = 0;
        for (Edge ed : edge) {
            if (disjointSet[ed.n1] != disjointSet[ed.n2]) {
                q.add(ed);
                weight += ed.weight;
                int root2 = ed.n2;
                while (root2 != disjointSet[root2]) {
                    root2 = disjointSet[root2];
                }
                int root1 = ed.n1;
                while (root1 != disjointSet[root1]) {
                    root1 = disjointSet[root1];
                }
                disjointSet[root2] = disjointSet[root1];
            }

        }
        while (!q.isEmpty()) {
            Edge ed = (Edge) q.poll();
            System.out.print(ed.n1 + " " + ed.n2);
            System.out.println();
        }
        System.out.println("Total Weight = " + weight);
    }
}



