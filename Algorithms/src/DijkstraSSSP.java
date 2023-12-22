import java.util.*;

/**
 * Created by Warida Rashid on 05 Nov 2015.
 */
public class DijkstraSSSP {
    public void sssp(int s, Node[] adjList, int[][] matrix) {
        int[] pred = new int[adjList.length];
        int[] dis = new int[adjList.length];
        boolean[] visited = new boolean[adjList.length];
        Queue<Node> q = new ArrayDeque<Node>();

        //Initializing the arrays
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < pred.length; i++) {
            pred[i] = -1;
        }
        for (int i = 0; i < dis.length; i++) {
            dis[i] = Integer.MAX_VALUE;
        }
        //Making Priority Queue of Nodes based on distance from source
        Comparator<Node> comp = new NodeComparator();
        PriorityQueue<Node> pq = new PriorityQueue<Node>(comp);
        //Setting distance of source to 0
        dis[s] = 0;
        adjList[s].distance = 0;
        pq.add(adjList[s]);

        //Running BFS
        while (!pq.isEmpty()) {
            Node v = adjList[(pq.poll()).val];
            if (!visited[v.val]) {
                visited[v.val] = true;
                for (Node head = v; head != null; head = head.next) {
                    //Relax Node
                    if (dis[head.val] > (matrix[v.val][head.val] + dis[v.val])) {
                        dis[head.val] = matrix[v.val][head.val] + dis[v.val];
                        head.distance = dis[head.val];
                        pred[head.val] = v.val;
                        pq.add(head);
                    }
                }
            }
        }
        /*for (int i:dis){
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i:pred){
            System.out.print(i+ " ");
        }*/
        System.out.println();
        //prints shortest path
        Stack<Integer> path = new Stack<Integer>();
        for (int i = 0; i < pred.length; i++) {
            for (int parent = i; parent != -1; parent = pred[parent]) {
                path.push(parent);
            }
            while (!path.isEmpty()) {
                System.out.print(path.pop() + "-->");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}


