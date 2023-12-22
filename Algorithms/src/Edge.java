/**
 * Created by Warida Rashid on 02 Nov 2015.
 */
public class Edge {
    public int n1 = -1;
    public int n2 = -1;
    public int weight = Integer.MAX_VALUE;

    public Edge(int n1, int n2, int weigth){
        this.n1 = n1;
        this.n2 = n2;
        this.weight = weigth;
    }
}
