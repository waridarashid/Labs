import java.util.Scanner;

public class lab01q21{
  public static void main (String[] aregs){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a number");
    int num = sin.nextInt();
    
    for (int row = 0; row < num; row++){
      for (int column=1; column <= 2*num-1; column++){
        if (row==num-1 || column==num-row || column==num+row ){
          System.out.print(column-(num-row-1));
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
          
          
          
          
   
        
        
 
      
  
  

      
        
  
    
    