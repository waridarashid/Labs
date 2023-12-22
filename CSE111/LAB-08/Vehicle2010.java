public class Vehicle2010 extends Vehicle{
  
  public void moveUpperRight(){
    moveUp();
    moveRight();
  }
  
  public void moveUpperLeft(){
    moveUp();
    moveLeft();
  }
  
  public void moveLowerRight(){
    moveDown();
    moveRight();
  }
  
  public void moveLowerLeft(){
    moveDown();
    moveLeft();
  }
  
  public boolean equals(Vehicle2010 car){
    String c1 = this.toString();
    String c2 = car.toString();
    return c1.equals(c2);
  }
}
    
   
       
       
       


