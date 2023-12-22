public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head = new Node(a[0], null);
    Node temp = head;
    for (int i=1; i < a.length; i++){
      Node n = new Node(a[i], null);
      temp.next = n;
      temp = n;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count = 0;
    for (Node n = head; n != null; n = n.next){
      count++;
    }
    return count;
  }
  
  /* prints the elements in the list */
  public void printList(){
    for (Node i = head; i != null; i=i.next){
      System.out.print(i.element);
      if (i.next != null){
        System.out.print(", ");
      }
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    Node req = null;
    int count =0;
    for (Node n = head;  count <= idx; n= n.next){
      req = n;
      count++;
    }
    return req;
  }
    
    
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    Object myElem = null;
    int count = 0;
    if (idx >= 0){
      for (Node n = head;  count <= idx; n= n.next){
        if (n == null){
          myElem = null;
          break;
        }
        else{
          myElem = n.element;
          count++;
        }
      }
    }
    return myElem;
  }
  
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    Object myElem = null;
    int count = 0;
    if (idx >= 0){
      for (Node n = head;  count <= idx && n!= null; n= n.next, count++){
        if (count == idx){
          myElem = n.element;
          n.element = elem;
        }
      }
    }
    return myElem;
  }
                 

  public int indexOf(Object elem){
    int count = 0;
    for( Node n = head; n != null; n = n.next, count++){
      if (n.element.equals(elem)){
        return count;
      }
    }
    return -1;
  }

  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    boolean bool = false;
    for( Node n = head; n != null; n = n.next){
      if (n.element == elem){
        bool = true;
        break;
      }
    }    
    return bool;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node copyHead = new Node(head.element, null);
    Node c = copyHead;
    for (Node n = head.next; n != null; n = n.next){
      Node copy = new Node(n.element, null);
      c.next = copy;
      c = copy;
    }
      
    return copyHead;
  }
  
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node reversed = null;
    for (Node n = head; n != null;){
      Node nextNode = n.next;
      n.next = reversed;
      reversed = n;
      n = nextNode;
    }
    return reversed;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    Node newNode = new Node(elem, null);
    if (idx == 0){
      newNode.next = head;
      head = newNode;
    }
    else{
      newNode.next = nodeAt(idx-1).next;
      nodeAt(idx-1).next = newNode;
    }
  }
  
  
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    Node n = nodeAt(index);
    Object obj = nodeAt(index).element;
    if (index == 0){
      head = head.next;
    }
    else{
      nodeAt((index-1)).next = nodeAt(index).next;
    }
    n.element = null;
    n.next = null;
    n = null;
    return obj;
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
  }
  
}