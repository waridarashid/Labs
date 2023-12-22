import java.util.Scanner;

public class lab02task05{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
    
    for (int i=0; i<num.length; i++){
      System.out.println ("Please enter a number");
      num [i] = sin.nextInt();
    }
    System.out.println ("Enter a number");
    int number = sin.nextInt();
    int i;
    
    for (i=0; i<num.length; i++){
      if (num[i]==number){
        System.out.println("yes");
        break;
      }
    }
    if (i==num.length){
      System.out.println ("no");
    }
  }
}
        
      
  
    