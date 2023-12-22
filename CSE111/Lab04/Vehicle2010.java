public class Vehicle2010{
  public int x=0;
  public int y=0;
  
  public void moveUp(){
    y+=1;
  }
  public void moveDown(){
    y = y-1;
  }
  public void moveRight(){
    x+=1;
  }
  public void moveLeft(){
    x=x-1;
  }
  public void moveUpperLeft(){
    moveUp();
    moveLeft();
  }

  public void moveUpperRight(){
    moveUp();
    moveRight();
  }

  public void moveLowerLeft(){
    moveDown();
    moveLeft();
  }

  public void moveLowerRight(){
    moveDown();
    moveRight();
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }

  public boolean equals(Vehicle2010 object){
    if (x == object.x && y == object.y){
      return true;
    }
    else{
      return false;
    }
  }
}



  
  

    