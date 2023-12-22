import java.util.Scanner;

public class lab01task01{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("enter the size of array");
    int [] num = new int [sin.nextInt()];
    boolean bool = false;
    
    for (int i=0; i < num.length; i++){
      System.out.println ("enter a number");
      num [i] = sin.nextInt();
    }
    
    if (num[0] == 6 || num [num.length-1] == 6){
      bool = true;
    }   
    System.out.println(bool);
  }
}
    
    
      