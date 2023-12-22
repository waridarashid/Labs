
//import java.util.*;

import java.io.*;
import java.util.Scanner;

public class DFSTest {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter number of vertices");
        int n = sin.nextInt();
        Node[] arr = new Node[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Node(i, null, null);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\dfs.txt"));
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                String[] parts = currentLine.split(",");

                if (parts.length == 2) {
                    try {
                        int v = Integer.parseInt(parts[0].trim(), 10);
                        int adjV = Integer.parseInt(parts[1].trim(), 10);
                        Node head = arr[v];
                        while (head.next != null) {
                            head = head.next;
                        }
                        head.next = new Node(adjV, head, null);
                        /*head = arr[adjV];
                        while (head.next != null) {
                            head = head.next;
                        }
                        head.next = new Node(v, head, null);*/
                    } catch (Exception nfe) {
                        nfe.printStackTrace();
                    }

                }

            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        for (int i = 0; i < arr.length; i++) {
            Node head;
            for (head = arr[i]; head != null; head = head.next) {
                System.out.print(head.val + "-->");
            }
            System.out.print("|");
            System.out.println();
        }
        ConnectedComponents cc = new ConnectedComponents();
        System.out.println("Number of connected components= " + cc.DFS_Search(0, arr));


    }
}

