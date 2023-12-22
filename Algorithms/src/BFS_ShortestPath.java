import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BFS_ShortestPath {
    public static void shortestPath(int s, int d, Node[] list) {
        int n = list.length;
        int[] pred = new int[n];
        int dis[] = new int[n];

        for (int i = 0; i < pred.length; i++) {
            pred[i] = -1;
        }

        for (int i = 0; i < dis.length; i++) {
            dis[i] = -1;
        }
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(list[s]);
        dis[s] = 0;

        while (q.isEmpty() != true) {
            Node v = q.poll();

            for (Node head = v; head != null; head = head.next) {
                if (dis[head.val] == -1) {
                    dis[head.val] = dis[v.val] + 1;
                    pred[head.val] = v.val;
                    q.add(list[head.val]);
                }
            }
        }
        for (int i = 0; i < dis.length; i++) {
            System.out.print(dis[i] + " ");
        }
        System.out.println();
        int c = 0;
        int[] path = new int[n];
        int i;
        for (i = d; i != s; i = pred[i]) {
            path[c] = i;
            c++;
        }
        if (i != s) {
            System.out.println("path doesn't exist");
        } else {
            for (int l = c; l >= 0; l--) {
                System.out.print(path[l] + " --> ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter number of vertices");
        int n = sin.nextInt();
        Node[] arr = new Node[n];
        System.out.println("Enter number of edges");
        int e = sin.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Node(i, null, null);
        }

        for (int i = 0; i < e; i++) {
            System.out.println("enter v");
            int v = sin.nextInt();
            System.out.println("enter adj v");
            int adjV = sin.nextInt();
            Node head = arr[v];
            while (head.next != null) {
                head = head.next;
            }
            head.next = new Node(adjV, head, null);
            head = arr[adjV];
            while (head.next != null) {
                head = head.next;
            }
            head.next = new Node(v, head, null);
        }

        for (int i = 0; i < arr.length; i++) {
            Node head;
            for (head = arr[i]; head.next != null; head = head.next) {
                System.out.print(head.val + "-->");
            }
            System.out.print(head.val);
            System.out.println();
        }
        shortestPath(0, 5, arr);
    }
}
