import java.util.Scanner;

public class lab01q16{
  public static void main (String[] aregs){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a number");
    int num = sin.nextInt();
    
    for (int row = 1; row <= num; row++){
      for (int column = 1; column <= num; column++){
        if (row==num || column==1 || column==row){
          System.out.print ("*");
        }
        else{
          System.out.print (" ");
        }
      }
      System.out.println();
    }
  }
}
          
          
        
  
  

      
        
  
    
    