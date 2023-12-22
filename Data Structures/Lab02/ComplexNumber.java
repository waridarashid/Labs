public class ComplexNumber extends RealNumber{
  private double imaginaryValue;
  
  public ComplexNumber(){
    super(1);
    imaginaryValue = 1;
  }
  
  public ComplexNumber(double r, double i){
    super(r);
    imaginaryValue = i;
  }
  public double getImaginaryValue(){
    return imaginaryValue;
  }
  public String toString() { 
    super.toString();
    return super.toString()+ "\n"+ "ImaginaryPart: "+ getImaginaryValue();
  } 
  public void ping() { 
        System.out.println("I'm in ComplexNumber class"); 
    }
  public void check() {
    ping();
    super.ping();
    System.out.println("checking ended");
  }
}