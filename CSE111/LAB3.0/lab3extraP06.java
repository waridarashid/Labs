import java.util.Scanner;

public class lab3extraP06{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println ("Please enter the value of n");
    int n = sin.nextInt();
    int y =0;
    
    for (int i=1; i<=n; i++){
      if (i%2==0){
        y = y - (i*i);
      }
      else{
        y = y + (i*i);
      }
    }
    System.out.println("y = " + y);
  }
}
        
      
    
    