import java.util.Scanner;

public class lab02task04{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[20];
    
    for (int i=0; i<num.length; i++){
      System.out.println ("Please enter a number");
      num [i] = sin.nextInt();
    }
    
    for (int i=num.length-1; i>=0; i--){
      if (num[i]%2==0){
        System.out.println(num[i]);
      }
    }
  }
}
        
      
  
    