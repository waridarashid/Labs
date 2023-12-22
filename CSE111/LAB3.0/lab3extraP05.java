import java.util.Scanner;

public class lab3extraP05{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("Please enter the valie of E");
    double E = sin.nextDouble();
    System.out.println("Please enter the valie of R");
    double R = sin.nextDouble();
    System.out.println("Please enter the valie of L");
    double L = sin.nextDouble();
    System.out.println("Please enter the valie of C");
    double C = sin.nextDouble();
    System.out.println("Please enter the valie of f");
    double f = sin.nextDouble();
    
    double I = E/(Math.sqrt(((R*R)+((((2*Math.PI*f*L) - (1/(2*Math.PI*f*C))))*(((2*Math.PI*f*L) - (1/(2*Math.PI*f*C))))))));
    System.out.println (I);
  }
}
    