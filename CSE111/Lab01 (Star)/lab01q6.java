import java.util.Scanner;

public class lab01q6{
  public static void main (String[] aregs){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a number");
    int num = sin.nextInt();
    
    for (int row = 1; row <= num; row++){
      for (int column=1; column <= row; column++){
        System.out.print (column);
      }
      System.out.println ();
    }
  }
}
      
  
  

      
        
  
    
    