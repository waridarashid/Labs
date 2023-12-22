public class QuadEqn{
  private int a;
  private int b;
  private int c;
  
  public QuadEqn(int a, int b, int c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public int getA(){
    return a;
  }
  public int getB(){
    return b;
  }
  public int getC(){
    return c;
  }
  public double root(){
    return (-b + Math.sqrt(4*a*c)) / (2*a);
  }
}
