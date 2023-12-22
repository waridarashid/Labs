public class Circle extends Point{
  public Circle(double r){
    super(r);
    System.out.println("Creating a Circle … done!");
  }
  double space(){    
    return Math.PI*getRadius()*getRadius();
   }
}