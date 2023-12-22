import java.util.Scanner;

public class user{
  public static void main(String[] args) throws Exception{
    HospitalManagement patient = new HospitalManagement();
    Scanner sin = new Scanner(System.in);
    
    System.out.println("Please enter your name");
    String name = sin.nextLine();
    Patient p = new Patient(name);
    
    //Registering a patient
    patient.registerPatient(p);
  }
}
    
    
    
    
    