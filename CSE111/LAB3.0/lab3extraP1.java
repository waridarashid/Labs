import java.util.Scanner;

public class lab3extraP1{
  public static void main(String[] args){
    int[] num = new int[10];
    Scanner sin = new Scanner(System.in);
    
    for (int i=0; i<num.length; i++){
      System.out.println("Please enter a number");
      num[i] = sin.nextInt();
    }
    
    
    for (int i=num.length-1; i>=0; i--){
      System.out.println(num[i]);
    }
  }
}

    
    
  