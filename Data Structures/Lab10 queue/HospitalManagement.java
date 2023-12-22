public class HospitalManagement{
  ArrayQueue patients = new ArrayQueue();
  
  public void registerPatient(Object p){
    try{
      patients.enqueue(p);
    }
    catch(Exception ex){
      System.out.println("No more space left");
    }
  }
  
  public void ServePatient(){
    Patient p = null;
    try{
      p = (Patient)patients.dequeue();
    }
    catch(Exception ex){
      System.out.println("No more patients left");
    }
    System.out.println(p.getName() + "is being called");
  }
}
  

    