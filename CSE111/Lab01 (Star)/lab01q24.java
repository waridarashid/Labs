import java.util.Scanner;

public class lab01q24{
  public static void main (String[] aregs){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a number");
    int num = sin.nextInt();
    int replacePosition;
    
    for (int position = 1; position <= 2*num-1; position++){
      if (position > num){
        replacePosition =  2*num - position;
      }
      else{
        replacePosition =  position;
      }
      System.out.print(replacePosition);
    }
  }
}
        
      
    
    