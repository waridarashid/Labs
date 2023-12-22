public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    start = st;
    size = sz;
    cir = new Object[lin.length];
    for (int i=0; i < size; i++){
      cir[(i+st)%lin.length] = lin[i];
    }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
    for (int i=0; i < cir.length; i++){
        System.out.print(cir[i]);
        if(i != cir.length-1){
          System.out.print(",");
        }
        else{
         System.out.print(".");
        }
      }
    System.out.println();
  }
      
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    for (int i=0; i < size; i++){
      System.out.print(cir[(i+start)%cir.length]);
      if(i != size-1){
        System.out.print(",");
      }
      else{
         System.out.print(".");
      }
    }
    System.out.println();
  }
  
  
  public void printBackward(){
    int k = (start + size - 1) % cir.length;
    for (int i = 0; i < size; i++){
      System.out.print(cir[k]);
      if(i != size-1){
        System.out.print(",");
      }
      else{
       System.out.print(".");
      }
      k--;
      if (k == -1){
        k = cir.length-1;
      }
    }
  }
  
  // With no null cells
  public void linearize(){
    Object[] cir2 = new Object[size];
    for (int i = 0; i < size; i++){
      cir2 [i] = cir [(i+start)%cir.length];
    }
    cir =cir2;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object[] cir2 = new Object[newcapacity];
    for (int i=0; i < size; i++){
      cir2[i] = cir [(i+start)%cir.length];
    }
    cir = cir2;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object[] cir2 = new Object[newcapacity];
    for (int i=0; i <size; i++){
      cir2 [i] = cir [(i+start)%cir.length];
    }
    cir = cir2;
    start = 0;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    int prevLen = cir.length;
    if (size == cir.length){
      resizeStartUnchanged(cir.length+3); 
    }
    int from = (start + (size - 1)) % prevLen;
    int to = (from+1) % cir.length; 
    for (int i = 0; i < size - pos; i++){
      cir[to] = cir[from];
      System.out.println(cir[to]);
      to--;
      from--;
      if (from == -1){
        from = prevLen - 1;
      }
    }
  }
          

  public void insertByLeftShift(Object elem, int pos){
    //TO DO
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    int to = (start+pos)  % cir.length;
    int from = (to+1) % cir.length;
    for (int i=0; i < size-pos; i++){
      cir[to] = cir[from];
      to = from;
      from = (from + 1) % cir.length;
    }
    cir[from] = null;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    //TO DO
  }
  
}