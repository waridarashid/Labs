public class Car{
  private int year;
  private static int count = 0;
  
  public Car(){
    count++;
  }
  
  public Car(int year){
    count++;
    this.year = year;
  }
  
  public static int getObjectCount(){
    return count;
  }
  
  public int getYear(){
    return year;
  }
}