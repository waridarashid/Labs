import java.util.Scanner;

public class lab01q3{
  public static void main (String[] aregs){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a number");
    int num1 = sin.nextInt();
    System.out.println ("Please enter another number");
    int num2 = sin.nextInt();
    
    for (int row = 0; row < num1; row++){
      for (int column = 0; column < num2; column++){
        System.out.print ("*");
      }
      System.out.println();
    }
  }
}
      
        
  
    
    