public class Vehicle{
  private int x;
  private int y;
  
  public Vehicle(){
    x = 0;
    y = 0;
  }
  
  public void moveUp(){
    y+=1;
  }
  
  public void moveDown(){
    y-=1;
  }
  
  public void moveLeft(){
    x-=1;
  }
  
  public void moveRight(){
    x+=1;
  }
  
  public String toString(){
    return ("("+x+" ,"+y+")");
  }
}
