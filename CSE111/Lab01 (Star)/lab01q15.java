import java.util.Scanner;

public class lab01q15{
  public static void main (String[] aregs){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a number");
    int num1 = sin.nextInt();
    System.out.println ("Please enter another number");
    int num2 = sin.nextInt();
    
    for (int row = 1; row <= num1; row++){
      for (int column = 1; column <= num2; column++){
        if (column==1 || column == num2 || row == 1 || row == num1){
          System.out.print (column);
        }
        else{
          System.out.print (" ");
        }
      }
      System.out.println();
    }
  }
}
          
          
          
    