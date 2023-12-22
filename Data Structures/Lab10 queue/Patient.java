public class Patient{
  private String name = "";
  public static int serial = 0;
  
  public Patient(String name){
    this.name = name;
    serial++;
  }
  
  public String getName(){
    return name;
  }
}