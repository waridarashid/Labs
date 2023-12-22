public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
      int count = 0;
      for (Node n = head.next; n != head; n = n.next){
        count++;
      }
      return count;
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
      for (Node n = head.next; n != head; n = n.next){
        System.out.print(n.element);
        if (n.next!=head){
          System.out.print(",");
        }
      }
      System.out.println();
    }
    
    public void backwardprint(){
      for (Node n = head.prev; n != head; n = n.prev){
        System.out.print(n.element);
        if (n.prev!=head){
          System.out.print(",");
        }
      }
      System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
      int count = 0;
      Node n = null;
      if (idx >= 0 && idx < countNode()){
        for (n = head.next; n != head; n = n.next, count++){
          if (count == idx){
            break;
          }
        }
      }
      return n;
    }
        
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
      int count = 0;
      Node n;
      for (n = head.next; n != head; n = n.next, count++){
        if (n.element.equals(elem)){
          break;
        }
      }
      if (n==head){
        count = -1;
      }
      return count;
    }
            
            

    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        Node n = new Node(elem, nodeAt(idx), nodeAt(idx).prev);
        n.prev.next = n;
        n.next.prev = n;
    }
      

    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
      Node n = nodeAt(index);
      Object elem = n.element;
      if (index < 0 || index > countNode()){
        elem = null;
      }
      n.prev.next = n.next;
      n.next.prev = n.prev;
      n.element = null;
      n.next = null;
      n.prev = null; 
      
      return elem;
    }
    
    
    
}