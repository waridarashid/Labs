public class Node{
  public Node pred = null;
  public Node next = null;
  public int val = -1;
  public int distance = Integer.MAX_VALUE;

  
  public Node(int val, Node pred, Node next){
    this.val = val;
    this.pred = pred;
    this.next = next;
  }
}

