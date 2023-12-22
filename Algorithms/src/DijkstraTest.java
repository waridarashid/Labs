import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Warida Rashid on 02 Nov 2015.
 */
public class DijkstraTest {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter number of vertices");
        int n = sin.nextInt();
        Node[] arr = new Node[n];
        //System.out.println("enter number of edges");
        //int e = sin.nextInt();
        //Edge[] edgeArr = new Edge[e];
        int [][] matrix = new int[n][n];
        //int counter = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Node(i, null, null);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"));
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                String[] parts = currentLine.split(",", 3);

                if (parts.length == 3) {
                    try {
                        int v = Integer.parseInt(parts[0].trim(), 10);
                        int adjV = Integer.parseInt(parts[1].trim(), 10);
                        int weight = Integer.parseInt(parts[2].trim(), 10);
                        matrix[v][adjV] = weight;
                        matrix[adjV][v] = weight;
                        //Edge edge = new Edge(v, adjV, weight);
                        //edgeArr[counter++] = edge;
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
                    } catch (Exception nfe) {
                        nfe.printStackTrace();
                    }
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        //prints list
        /*for (int i = 0; i < arr.length; i++) {
            Node head;
            for (head = arr[i]; head != null; head = head.next) {
                System.out.print(head.val + "-->");
            }
            System.out.print("|");
            System.out.println();
        }*/

        /*for (Edge f : edgeArr) {
            System.out.println("Edge: " + f.n1 + " " + f.n2);
        }*/
        DijkstraSSSP k = new DijkstraSSSP();
        k.sssp(0, arr, matrix);
    }
}



