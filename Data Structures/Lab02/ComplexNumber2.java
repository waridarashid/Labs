public class ComplexNumber2{
  double real = 0;
  double imaginary = 0;
  public ComplexNumber2(double r, double i){
    real = r;
    imaginary = i;
  }
  public void increaseValue(){
    real += 2;
    imaginary += 2;
  }
  public String toString(){
    return real + "+" +imaginary + "i";
  }
  public void polarRadius(){
    double rad = Math.sqrt((real*real)+(imaginary*imaginary));
    System.out.println(rad);
  }
}
    
    