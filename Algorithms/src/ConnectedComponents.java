import java.lang.reflect.Array;
import java.util.Stack;

/**
 * Created by Warida Rashid on 31 Oct 2015.
 */
public class ConnectedComponents {
    private boolean[] visited;
    private int[] pred;
    private int[] start;
    private int[] finish;
    private int time = 0;
    Stack components = new Stack();

    public int DFS_Search(int s, Node[] arr) {
        visited = new boolean[arr.length];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        pred = new int[arr.length];
        for (int i = 0; i < visited.length; i++) {
            pred[i] = -1;
        }
        start = new int[arr.length];
        finish = new int[arr.length];
        int counter = 0;
        int componentName;

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                componentName = i;
                System.out.println("Component: " + componentName);
                counter++;
                DFSVisit(arr[i], arr);
                while (!components.isEmpty()) {
                    System.out.print(components.pop() + " ");
                }
                System.out.println();
            }
        }
        return counter;
    }

    public void DFSVisit(Node source, Node[] arr) {
        visited[source.val] = true;
        start[source.val] = ++time;
        for (Node head = source; head != null; head = head.next) {
            if (!visited[head.val]) {
                Node nextNode = arr[head.val];
                pred[head.val] = source.val;
                DFSVisit(nextNode, arr);
            }
        }
        finish[source.val] = ++time;
        components.push(source.val);
    }
}
