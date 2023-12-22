public class ComplexNumber extends RealNumber{
  private double complexValue;
  
  public ComplexNumber(){
    super(1);
    complexValue =1;
  }
  
  public ComplexNumber(double r, double c){
    super(r);
    complexValue = c;
  }
  
  public String toString(){
    return "RealPart :" + getRealValue() +"\n" + "ComplexPart: " + complexValue;
  }
  
  public void check(){
    ping();
    super.ping();
    System.out.println("Checking ended.");
  }
  public void ping() {
    System.out.println("I'm in ComplexNumber class");
  }
    
    
    
}