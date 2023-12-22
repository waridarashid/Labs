import java.util.Scanner;

public class lab01task07{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int[] num = new int[10];
    
     for(int i=0; i<10; i++){
      System.out.println("Please enter a number");
      num[i] = sin.nextInt();
    }
     System.out.println("Please enter a number between 0 to 9");
     int index = sin.nextInt();
     
     for(int i=0; i < num[index]; i++){
       System.out.print("*");
     }
  }
}
     