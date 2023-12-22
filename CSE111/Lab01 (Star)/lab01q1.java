import java.util.Scanner;

public class lab01q1{
  public static void main (String[] aregs){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter a number");
    int num = sin.nextInt();
    
    for (int i=1; i<=num; i++){
      System.out.print (i);
    }
  }
}
    
    