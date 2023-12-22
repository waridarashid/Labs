public class VehicleTest{
  public static void main(String[] args){
    Vehicle car = new Vehicle();
    System.out.println(car.toString());
    car.moveUp();
    System.out.println(car.toString());
    car.moveLeft();
    System.out.println(car.toString());
    car.moveDown();
    System.out.println(car.toString());
    car.moveRight();
  }
}

    

    