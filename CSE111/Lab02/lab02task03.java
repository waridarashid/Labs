import java.util.Scanner;

public class lab02task03{
  public static void main (String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
    
    for (int i=0; i<10; i++){
      System.out.println ("Please enter a number");
      num [i] = sin.nextInt();
    }
    
    for (int i=9; i>=0; i--){
      System.out.println(num[i]);
    }
  }
}
    