import java.util.Scanner;

public class lab01q12{
  public static void main (String[] aregs){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a number");
    int num = sin.nextInt();
    int replaceRow;
    
    for (int row = 0; row < 2*num-1; row++){
      if (row > num-1){
          replaceRow = (num-1)-(row-(num-1));
        }
      else {
        replaceRow=row;
      }
      for (int column=1; column <= 2*num-1; column++){
        if (column <= num-replaceRow-1){
          System.out.print(" ");
        }
        else if (column <= num+replaceRow){
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
          
          
          
          
   
        
        
 
      
  
  

      
        
  
    
    